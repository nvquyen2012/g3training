package com.example.feignclient.ControllerCenter;

import com.example.feignclient.demomapstruct_feignclient.AddressFeignClient;
import com.example.libs.dto.AddressDTO;
import com.example.libs.dto.PageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/g3/api/address")
public class AddressController {

    @Autowired
    private AddressFeignClient addressFeignClient;

    @GetMapping("/get")
    PageObject<AddressDTO> get(Pageable pageable) {
        return addressFeignClient.get(pageable);
    }

    @PostMapping("/create")
    ResponseEntity<AddressDTO> create(AddressDTO addressDTO) {
        return addressFeignClient.create(addressDTO);
    }
}
