package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.AbstractDto;
import com.example.demomapstruct.dto.PageObject;
import com.example.demomapstruct.entity.AbstractEntity;
import com.example.demomapstruct.service.AbstractService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

public class AbstractController<T extends AbstractEntity, E extends AbstractDto> {

    private AbstractService<T, E> abstractService;

    public AbstractController(AbstractService<T, E> abstractService) {
        this.abstractService = abstractService;
    }

    @GetMapping("/get")
    public PageObject<E> get(Pageable pageable) {
        return abstractService.get(pageable);
    }
}
