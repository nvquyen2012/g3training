package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.AddressDto;
import com.example.demomapstruct.payload.BasePage;
import com.example.demomapstruct.payload.BaseResponse;
import com.example.demomapstruct.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/address"))
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/get")
    public BaseResponse<BasePage<AddressDto>> get(Pageable pageable) {
        return BaseResponse.<BasePage<AddressDto>>builder()
                .code("200")
                .message("OK")
                .data(addressService.get(pageable))
                .build();
    }
}
