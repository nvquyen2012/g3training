package com.example.demomapstruct.mapper;

import com.example.libs.mapper.AbstractMapper;
import org.mapstruct.Mapper;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.dto.AddressDTO;

@Mapper(componentModel = "spring")
public interface AddressMapper extends AbstractMapper<Address, AddressDTO> {
}
