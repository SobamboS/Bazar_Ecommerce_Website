package com.appsdeveloperblog.app.ws.mobileappws.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>{
    Optional<Vendor> findByEmail(String email);
}
