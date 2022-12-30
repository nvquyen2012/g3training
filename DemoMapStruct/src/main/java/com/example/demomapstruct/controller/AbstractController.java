package com.example.demomapstruct.controller;

import com.example.demomapstruct.annotation.MakeChangesInDatabase;
import com.example.demomapstruct.dto.AbstractDTO;
import com.example.demomapstruct.dto.PageObject;
import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.AbstractEntity;
import com.example.demomapstruct.exception.InvalidStudentException;
import com.example.demomapstruct.service.AbstractService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Getter
@Setter
public class AbstractController<T extends AbstractEntity, E extends AbstractDTO> {

    private AbstractService<T, E> abstractService;

    public AbstractController(AbstractService<T, E> abstractService) {
        this.abstractService = abstractService;
    }

    @GetMapping("/get")
    public PageObject<E> get( Pageable pageable) {
        return abstractService.get(pageable);
    }

    @MakeChangesInDatabase
    @PostMapping("/create")
    public ResponseEntity<E> create(@RequestBody @Valid E dto) {
        return ResponseEntity.ok(abstractService.create(dto));
    }

    @MakeChangesInDatabase
    @PutMapping("/update")
    public ResponseEntity<E> update(@RequestBody @Valid E dto) {
        return ResponseEntity.ok(abstractService.update(dto));
    }

    @MakeChangesInDatabase
    @DeleteMapping("/delete")
    public ResponseEntity<E> delete(@RequestBody E dto) {
        return ResponseEntity.ok(abstractService.delete(dto));
    }

}
