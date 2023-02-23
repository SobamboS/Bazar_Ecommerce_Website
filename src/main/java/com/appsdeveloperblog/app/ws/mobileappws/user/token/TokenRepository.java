package com.appsdeveloperblog.app.ws.mobileappws.user.token;

import jakarta.transaction.Transactional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface TokenRepository extends MongoRepository <Token, String>{
    Optional<Token>findByToken(String token);

    void deleteTokenByExpiredAtBefore(LocalDateTime now);

    @Transactional
    void confirmedAt(LocalDateTime now, String token);

}
