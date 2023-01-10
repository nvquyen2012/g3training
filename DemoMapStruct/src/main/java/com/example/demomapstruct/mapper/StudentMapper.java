package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import com.example.libs.mapper.AbstractMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {StudentAddressMapper.class})
public interface StudentMapper extends AbstractMapper<Student, StudentDTO> {

}
