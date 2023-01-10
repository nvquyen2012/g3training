package com.example.demomapstruct.dto;

import com.example.libs.dto.AbstractDTO;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class StudentDTO extends AbstractDTO {


    private String firstName;

    @Size(min = 1, max = 10, message = "Last name length must be between 1 and 10")
    private String lastName;

    @Max(value = 40, message = "Student age must not be greater than 40")
    @Min(value = 12, message = "Student age must not be less than 12")
    private int age;

    private Set<StudentAddressDTO> addressList = new HashSet<>();
}
