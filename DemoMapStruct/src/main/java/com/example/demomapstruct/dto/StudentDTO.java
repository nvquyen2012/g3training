package com.example.demomapstruct.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class StudentDTO extends AbstractDTO{

    private String firstName;

    private String lastName;

    private int age;

    private Set<StudentAddressDTO> addressList = new HashSet<>();
}
