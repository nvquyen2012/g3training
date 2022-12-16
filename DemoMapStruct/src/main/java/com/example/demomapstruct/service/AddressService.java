package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AddressDto;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.mapper.AddressMapper;
import com.example.demomapstruct.payload.BasePage;
import com.example.demomapstruct.repository.AddressRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.stream.Collectors;

@Service
public class AddressService implements IAddressService{

    private AddressRepository addressRepository;

    private AddressMapper addressMapper;

    @Autowired
    public AddressService(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    @Transactional(dontRollbackOn = Exception.class, rollbackOn = (NumberFormatException.class))
    @Override
    public AddressDto create(AddressDto dto) {
        return addressMapper.toDto(addressRepository.save(addressMapper.toEntity(dto)));
    }

    @Override
    public BasePage<AddressDto> get(Pageable pageable) {
        @NonNull Page<Address> page = addressRepository.findAll(pageable);
        return BasePage.<AddressDto>builder()
                .content(page.getContent().stream().map(addressMapper::toDto).collect(Collectors.toList()))
                .size(page.getSize())
                .number(page.getNumber())
                .totalElements(page.getNumberOfElements())
                .totalPages(page.getTotalPages())
                .build();
    }
}
