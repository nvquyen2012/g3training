package com.example.demomapstruct.entity;

import lombok.*;

import javax.persistence.*;

//@Data
@Entity
@Getter
@Setter
@Table(name = "address")
@SequenceGenerator(name = "seq_address_id", sequenceName = "seq_address_id", initialValue = 1, allocationSize=1)
@AttributeOverride(name = "id", column = @Column(name = "address_id"))
public class Address extends AbstractEntity{

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_address_id")
//    @SequenceGenerator(name = "seq_address_id", sequenceName = "seq_address_id", initialValue = 1, allocationSize=1)
//    @Column(name = "id", nullable = false)
//    private Long id;

    private String city;

    private String address;

    public Address() {
    }
}
