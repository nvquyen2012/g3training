package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.StudentDto;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.Qualifier;

@Mapper(componentModel = "spring")
public interface StudentMapper extends AbstractMapper<Student, StudentDto>{

    @Mapping(target = "fullName", expression = "java(entity.getFirstName() + \" \" + entity.getLastName())")
    StudentDto toDto(Student entity);

    @Mapping(target = "firstName", source = "fullName", qualifiedByName = "getFirstName")
    @Mapping(target = "lastName", source = "fullName", qualifiedByName = "getLastName")
    Student toEntity(StudentDto dto);

    @Named("getFirstName")
    static String getFirstName(String fullName) {
        return fullName.split(" ")[0];
    }

    @Named("getLastName")
    static String getLastName(String fullName) {
        return fullName.split(" ")[0];
    }

}