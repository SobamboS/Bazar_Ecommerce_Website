package com.appsdeveloperblog.app.ws.mobileappws.security;

import com.appsdeveloperblog.app.ws.mobileappws.model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class PrincipalUser implements UserDetails{

    private static final long serialVersionUID = -3732949233884048693L;

    private final User user;
    private final String email;
    private final String password;

    private Map<String, Object> attributes;
    private final Collection<? extends GrantedAuthority> authorities;

    public static PrincipalUser create(User user) {
        Collection<? extends GrantedAuthority> authorities = getAuthorities(user);
        return new PrincipalUser(user, user.getEmail(), user.getPassword(), authorities);
    }

    public static PrincipalUser create(User user, Map<String, Object> attributes) {
        PrincipalUser principalUser = create(user);
        principalUser.setAttributes(attributes);
        return principalUser;
    }

    public static Set<SimpleGrantedAuthority> getAuthorities(User user) {
        return Collections.singleton(new SimpleGrantedAuthority(user.getRole().getName()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getIsActive().booleanValue();
    }

    private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException{
        stream.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
    }

}
