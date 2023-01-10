package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.AddressDTO;
import com.example.demomapstruct.entity.Address;
import com.example.demomapstruct.service.AddressService;
import com.example.libs.controller.AbstractController;
import com.example.libs.payload.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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

    @PostMapping("/create-custom")
    public ResponseEntity<AddressDTO> create(@RequestBody @Valid AddressDTO dto, HttpServletRequest request) {
        String city = request.getAttribute("city").toString();
        if(city != null) {
            dto.setCity(city);
        }
        AddressDTO result = super.getAbstractService().create(dto);
        return ResponseEntity.ok(result);
    }

}
