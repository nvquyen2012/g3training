package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.StudentAddressDTO;
import com.example.demomapstruct.entity.StudentAddress;
import com.example.demomapstruct.mapper.StudentAddressMapper;
import com.example.demomapstruct.repository.StudentAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentAddressServiceImpl extends AbstractServiceImpl<StudentAddress, StudentAddressDTO> implements StudentAddressService {

    @Autowired
    public StudentAddressServiceImpl(StudentAddressRepository StudentAddressRepository, StudentAddressMapper studentAddressMapper) {
        super(StudentAddressRepository, studentAddressMapper);
    }
}
