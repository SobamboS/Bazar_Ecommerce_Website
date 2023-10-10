package com.appsdeveloperblog.app.ws.mobileappws.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class JwtService{
    @Value("${SECRET_KEY}")
    private String SECRET_KEY;
    private static final String AUTHORITIES_KEY = "authorities";

    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET_KEY));
    }

    public <T> T extractClaims(String token, Function<Claims, T> claimResolver ){
        final Claims claims = extractAllClaims(token);
        return claimResolver.apply(claims);
    }

    public String extractEmail(String token){
        return extractClaims(token, Claims::getSubject);
    }

    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(key())
                .build()
                .parseClaimsJws(token)
                .getBody();

    }

    public String generateToken(Map<String,Object> extractClaims,UserDetails userDetails){
        return Jwts
                .builder()
                .setClaims(extractClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                .signWith(key(),SignatureAlgorithm.HS256)
                .compact();

    }

    public String generateToken(Authentication authentication) {

        final String authorities = authentication.getAuthorities().stream().map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));

        PrincipalUser user = (PrincipalUser) authentication.getPrincipal();
        Map<String, Object> claims = new HashMap<>();
        claims.put(AUTHORITIES_KEY, authorities);

        return generateToken(claims,user.getUsername());
    }



    public boolean isTokenValid(String token, UserDetails userDetails){
        final String username = extractEmail(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));

    }

    private boolean isTokenExpired(String token){
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token){
        return extractClaims(token, Claims::getExpiration);
    }

    UsernamePasswordAuthenticationToken getAuthentication(final String token,final UserDetails userDetails) {

        final Claims claims = extractAllClaims(token);

        final Collection<? extends GrantedAuthority> authorities = Arrays
                .stream(claims.get(AUTHORITIES_KEY).toString().split(",")).map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return new UsernamePasswordAuthenticationToken(userDetails, "", authorities);
    }
}
