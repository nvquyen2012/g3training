package com.example.demomapstruct.dto;

import com.example.libs.dto.AbstractDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddressDTO extends AbstractDTO {

//    private Long id;

    private String city;

    private String fullAddress;
}
