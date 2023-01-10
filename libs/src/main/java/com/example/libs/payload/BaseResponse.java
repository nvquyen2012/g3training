package com.example.libs.payload;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T> {

    private String code;

    private String message;

    private T data;
}
