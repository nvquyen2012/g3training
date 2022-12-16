package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AbstractDto;
import com.example.demomapstruct.dto.PageObject;
import com.example.demomapstruct.entity.AbstractEntity;
import org.springframework.data.domain.Pageable;

public interface AbstractService<T extends AbstractEntity, E extends AbstractDto> {

    E create(E dto);

    PageObject<E> get(Pageable pageable);

    E update(E dto);

    E delete(E dto);
}
