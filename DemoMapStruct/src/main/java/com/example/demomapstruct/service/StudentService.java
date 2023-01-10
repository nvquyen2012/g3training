package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import com.example.libs.service.AbstractService;

public interface StudentService extends AbstractService<Student, StudentDTO> {

    StudentDTO getOne(Long id);
}
