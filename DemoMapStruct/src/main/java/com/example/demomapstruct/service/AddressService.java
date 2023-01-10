package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;
import com.example.libs.service.AbstractService;

public interface AddressService extends AbstractService<Address, AddressDTO> {
    AddressDTO findByCity(String city);

    AddressDTO getOne(Long id);
}
