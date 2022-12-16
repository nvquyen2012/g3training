package com.example.demomapstruct.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    @ManyToMany
    @JoinTable(name = "student_address")
//    @OneToOne(mappedBy = "student")
    private List<Address> addresses;

    public Student() {
    }

    @Builder
    public Student(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
