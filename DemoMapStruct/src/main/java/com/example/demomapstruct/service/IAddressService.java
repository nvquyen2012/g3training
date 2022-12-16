package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AddressDto;
import com.example.demomapstruct.payload.BasePage;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface IAddressService {

    AddressDto create(AddressDto dto);

    BasePage<AddressDto> get(Pageable pageable);
}
