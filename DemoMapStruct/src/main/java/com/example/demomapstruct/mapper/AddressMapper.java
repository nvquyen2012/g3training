package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {StudentAddressMapper.class})
public interface AddressMapper extends AbstractMapper<Address, AddressDTO>{

}
