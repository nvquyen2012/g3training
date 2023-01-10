package com.example.libs.mapper;

import java.util.List;

public interface AbstractMapper<T, Y> {

    T toEntity(Y dto);

    Y toDTO(T entity);

    List<Y> toListDTO(List<T> list);
}
