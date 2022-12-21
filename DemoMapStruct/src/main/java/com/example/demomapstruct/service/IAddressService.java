package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.payload.BasePage;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface IAddressService {

    AddressDTO create(AddressDTO dto);

    BasePage<AddressDTO> get(Pageable pageable);
}
