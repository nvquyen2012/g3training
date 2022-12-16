package com.example.demomapstruct.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Table(name = "student")
@SequenceGenerator(name = "seq_student_id", sequenceName = "seq_student_id", initialValue = 1, allocationSize=1)
@AttributeOverride(name = "id", column = @Column(name = "student_id"))
@Getter
@Setter
public class Student extends AbstractEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_student_id")
//    @SequenceGenerator(name = "seq_student_id", sequenceName = "seq_student_id", initialValue = 1, allocationSize=1)
//    @Column(name = "id", nullable = false)
//    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private int age;

//    @OneToOne(mappedBy = "student")
//    private Address address;

}
