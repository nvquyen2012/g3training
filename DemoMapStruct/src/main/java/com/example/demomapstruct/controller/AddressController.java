package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.payload.BaseResponse;
import com.example.demomapstruct.service.AddressService;
import com.example.demomapstruct.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/address"))
public class AddressController extends AbstractController<Address, AddressDTO> {

    @Autowired
    public AddressController(AddressService addressService) {
        super(addressService);
    }

    @GetMapping("/{id}")
    public BaseResponse getOne(@PathVariable Long id) {
        return BaseResponse.builder()
                .data(((AddressService) super.getAbstractService()).getOne(id))
                .code("OK")
                .message("")
                .build();
    }

}
