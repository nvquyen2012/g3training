package com.example.libs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentAddressDTO extends AbstractDTO {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long addressId;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long studentId;

    private AddressDTO address;
}
