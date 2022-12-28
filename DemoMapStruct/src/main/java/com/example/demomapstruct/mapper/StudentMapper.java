package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring", uses = {StudentAddressMapper.class})
public interface StudentMapper extends AbstractMapper<Student, StudentDTO>{

}
