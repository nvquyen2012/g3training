package com.example.feignclient.hystrix;

import com.example.feignclient.demomapstruct_feignclient.AddressFeignClient;
import com.example.libs.dto.AddressDTO;
import com.example.libs.dto.PageObject;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HystrixClient implements FallbackFactory<AddressFeignClient> {

    @Override
    public AddressFeignClient create(Throwable cause){
        return new AddressFeignClient() {
            @Override
            public PageObject<AddressDTO> get(Pageable pageable) {
                List<AddressDTO> addressDTOS = new ArrayList<>();
                return  PageObject.<AddressDTO>builder().pageNumber(0)
                        .pageSize(0)
                        .build();
            }

            @Override
            public ResponseEntity<AddressDTO> create(AddressDTO addressDTO) {
                return new ResponseEntity<>(new AddressDTO("HN", "Fallback Hystrix"), HttpStatus.ACCEPTED);
            }
        };
    };
}
