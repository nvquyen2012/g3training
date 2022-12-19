package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AddressDto;
import com.example.demomapstruct.dto.StudentDto;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.mapper.AbstractMapper;
import com.example.demomapstruct.mapper.AddressMapper;
import com.example.demomapstruct.repository.AbstractRepository;
import com.example.demomapstruct.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends AbstractServiceImpl<Address, AddressDto> implements AddressService{

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        super(addressRepository);
        super.setAbstractMapper(addressMapper);
    }
}
