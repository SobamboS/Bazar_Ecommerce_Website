package com.appsdeveloperblog.app.ws.mobileappws.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class WebSecurityConfiguration{
    private final JwtAuthenticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    @Autowired
    public WebSecurityConfiguration(JwtAuthenticationFilter jwtAuthFilter,AuthenticationProvider authenticationProvider){
        this.jwtAuthFilter=jwtAuthFilter;
        this.authenticationProvider=authenticationProvider;
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers("").permitAll() // No authentication
                                .requestMatchers("/user/create", "/user/update","/user/delete").hasAnyRole(ERole.SUPER_ADMIN.name(), ERole.ADMIN.name())
                                .anyRequest().authenticated()
                )
                .authenticationProvider(authenticationProvider)
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
