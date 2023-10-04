package com.appsdeveloperblog.app.ws.mobileappws.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Role")
@Builder
public class Role{

    @Id
    @Column(nullable = false, name = "Id")
    @SequenceGenerator(name = "seq", initialValue = 100, allocationSize = 1)
    @GeneratedValue(generator = "seq", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    public Role(String name) {
        this.name = name;
    }
}
