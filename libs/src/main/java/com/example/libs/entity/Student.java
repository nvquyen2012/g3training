package com.example.libs.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
@SequenceGenerator(name = "hibernate_sequence", sequenceName = "seq_student_id", initialValue = 1, allocationSize=1)
@AttributeOverride(name = "id", column = @Column(name = "student_id"))
@Getter
@Setter
public class Student extends AbstractEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "student")
    @JsonManagedReference(value = "student_studentAddress")
    private Set<StudentAddress> addressList = new HashSet<>();

}
