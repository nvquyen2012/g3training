package com.example.demomapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AddressDto extends AbstractDto{

    private String city;

    private String address;


}
