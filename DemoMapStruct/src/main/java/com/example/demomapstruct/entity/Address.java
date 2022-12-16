package com.example.demomapstruct.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String city;

    private String address;

    @OneToOne
    @ManyToMany
    @JoinColumn(name = "student_id")
    private Student student;

    @Builder
    public Address(Long id, String city, String address) {
        this.id = id;
        this.city = city;
        this.address = address;
    }

    public Address() {

    }
}
