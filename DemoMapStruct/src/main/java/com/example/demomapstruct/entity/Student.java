package com.example.demomapstruct.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "student")
@SequenceGenerator(name = "hibernate_sequence", sequenceName = "seq_student_id", initialValue = 1, allocationSize=1)
@AttributeOverride(name = "id", column = @Column(name = "student_id"))
@Getter
@Setter
public class Student extends AbstractEntity{

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
