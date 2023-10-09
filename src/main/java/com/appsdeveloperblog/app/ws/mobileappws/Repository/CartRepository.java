package com.appsdeveloperblog.app.ws.mobileappws.Repository;


import com.appsdeveloperblog.app.ws.mobileappws.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

//   Cart findById(Long id);
}
