package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.AddressDto;
import com.example.demomapstruct.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper extends AbstractMapper<Address, AddressDto>{

}
