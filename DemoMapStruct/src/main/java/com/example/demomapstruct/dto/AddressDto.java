package com.example.demomapstruct.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class AddressDto extends AbstractDto{

//    private Long id;

    private String city;

    private String address;
}
