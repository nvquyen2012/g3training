package com.example.demomapstruct.repository;

import com.example.demomapstruct.entity.Student;
import com.example.libs.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends AbstractRepository<Student> {
}
