package com.appsdeveloperblog.app.ws.mobileappws.user.token;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TokenRepository  extends MongoRepository<Token, String>{
}
