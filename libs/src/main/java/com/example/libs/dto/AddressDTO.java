package com.example.libs.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO extends AbstractDTO {

    private Long id;

    private String city;

    private String fullAddress;
}
