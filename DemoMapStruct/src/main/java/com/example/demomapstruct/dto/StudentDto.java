package com.example.demomapstruct.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto extends AbstractDto{

    private String fullName;

    private int age;

    private String address;
}
