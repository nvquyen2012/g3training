package com.example.demomapstruct.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AbstractDto {

    public Long id;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;
}
