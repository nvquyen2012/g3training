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

    @Mapping(target = "address", source = "address.address")
    @Mapping(target = "fullName", expression = "java(entity.getFirstName() + \" \" + entity.getLastName())")
    StudentDto toDto(Student entity);

    @Mapping(target = "firstName", expression = "java(dto.getFirstName())")
    @Mapping(target = "lastName", expression = "java(dto.getLastName())")
//    @Mapping(target = "address", qualifiedByName = "newAddress")
    Student toEntity(StudentDto dto);

    @Named("newAddress")
    public default Address createNewAddress(String address) {
        return Address.builder().address(address).build();
    }



}
