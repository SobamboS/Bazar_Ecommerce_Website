package com.appsdeveloperblog.app.ws.mobileappws.Vendor;

import com.appsdeveloperblog.app.ws.mobileappws.Vendor.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface VendorRepository extends MongoRepository<Vendor, String>{
    Optional<Vendor> findByEmail(String email);
}
