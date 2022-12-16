package com.example.demomapstruct.mapper;

import java.util.List;

public interface AbstractMapper<T, Y> {

    T toEntity(Y dto);

    Y toDto(T entity);

    List<Y> toListDto(List<T> list);
}
