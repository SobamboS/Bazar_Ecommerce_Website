package com.appsdeveloperblog.app.ws.mobileappws.security;

import com.appsdeveloperblog.app.ws.mobileappws.exception.UserException;
import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import com.appsdeveloperblog.app.ws.mobileappws.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserDetailsImplementation implements UserDetailsService{

    private final UserRepository userRepository;

    @Transactional
    @Override
    public PrincipalUser loadUserByUsername(String username) {
        User user = userRepository.findByEmailAddressIgnoreCase(username)
                .orElseThrow(() -> new UserException("User not found"));

        return PrincipalUser.create(user);
    }
}
