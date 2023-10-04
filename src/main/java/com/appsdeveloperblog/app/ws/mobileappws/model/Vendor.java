package com.appsdeveloperblog.app.ws.mobileappws.model;


import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name="Vendor")
@Setter
@Getter
@NoArgsConstructor
public class Vendor{
    @Id
    private Long id;

    private String address;


}
