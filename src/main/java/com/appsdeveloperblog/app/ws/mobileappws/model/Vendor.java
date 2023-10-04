package com.appsdeveloperblog.app.ws.mobileappws.model;


import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;




}
