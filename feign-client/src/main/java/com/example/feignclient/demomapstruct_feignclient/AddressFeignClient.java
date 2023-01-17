package com.example.feignclient.demomapstruct_feignclient;

import com.example.feignclient.hystrix.HystrixClient;
import com.example.libs.dto.AddressDTO;
import com.example.libs.dto.PageObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "g3-demo-map-struct", path = "${g3training.client.api.demomapstruct.address}", fallbackFactory = HystrixClient.class)
public interface AddressFeignClient {

    @GetMapping("/get")
    PageObject<AddressDTO> get(Pageable pageable);

    @PostMapping("/create")
    ResponseEntity<AddressDTO> create(AddressDTO addressDTO);
}
