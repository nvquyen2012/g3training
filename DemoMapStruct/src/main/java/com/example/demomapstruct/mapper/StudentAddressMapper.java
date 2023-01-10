package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.StudentAddressDTO;
import com.example.demomapstruct.entity.StudentAddress;
import com.example.libs.mapper.AbstractMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentAddressMapper extends AbstractMapper<StudentAddress, StudentAddressDTO> {
}
