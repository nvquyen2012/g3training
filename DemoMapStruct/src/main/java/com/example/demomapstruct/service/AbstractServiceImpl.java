package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AbstractDto;
import com.example.demomapstruct.dto.PageObject;
import com.example.demomapstruct.entity.AbstractEntity;
import com.example.demomapstruct.mapper.AbstractMapper;
import com.example.demomapstruct.repository.AbstractRepository;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Getter
@Setter
public abstract class AbstractServiceImpl<T extends AbstractEntity, E extends AbstractDto> implements AbstractService<T, E> {

    private AbstractRepository<T> abstractRepository;

    private AbstractMapper<T, E> abstractMapper;

    public AbstractServiceImpl(AbstractRepository<T> abstractRepository) {
        this.abstractRepository = abstractRepository;
    }

    @Override
    public E create(E dto) {
        T entity = toEntity(dto);
        return toDto(abstractRepository.<T>save(entity));
    }

    @Override
    public PageObject<E> get(Pageable pageable) {
        if(pageable == null) {
            pageable = PageRequest.of(0, 10);
        }
        Page<T> page = abstractRepository.<T>findAll(pageable);
        return toPageObject(page);
    }

    @Override
    public E update(E dto) {
        T entity = toEntity(dto);
        return toDto(abstractRepository.<T>save(entity));
    }

    @Override
    public E delete(E dto) {
        abstractRepository.delete(abstractMapper.<T>toEntity(dto));
        return dto;
    }

    private PageObject<E> toPageObject(Page<T> page) {
        PageObject<E> result = new PageObject<E>();
        return PageObject.<E>builder()
                .pageNumber(page.getNumber())
                .pageSize(page.getSize())
                .totalPages(page.getTotalPages())
                .totalElements(page.getNumberOfElements())
                .content(abstractMapper.toListDto(page.getContent())).build();
    }

    private T toEntity(E dto) {
        return abstractMapper.toEntity(dto);
    }

    private E toDto(T entity) {
        return abstractMapper.toDto(entity);
    }

}
