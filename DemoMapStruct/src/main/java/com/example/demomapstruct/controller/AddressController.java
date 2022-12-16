package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.AddressDto;
import com.example.demomapstruct.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/address"))
public class AddressController<Address, AddressDto> extends AbstractController{

    @Autowired
    public AddressController(AddressService addressService) {
        super(addressService);
    }

}
