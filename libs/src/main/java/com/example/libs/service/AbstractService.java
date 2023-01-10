package com.example.libs.service;

import com.example.libs.dto.AbstractDTO;
import com.example.libs.dto.PageObject;
import com.example.libs.entity.AbstractEntity;
import com.example.libs.mapper.AbstractMapper;
import com.example.libs.repository.AbstractRepository;
import org.springframework.data.domain.Pageable;

public interface AbstractService<T extends AbstractEntity, E extends AbstractDTO> {

    E create(E dto);

    PageObject<E> get(Pageable pageable);

    E update(E dto);

    E delete(E dto);

    void setAbstractMapper(AbstractMapper<T, E> abstractMapper);

    AbstractMapper<T, E> getAbstractMapper();
    void setAbstractRepository(AbstractRepository<T> abstractRepository);

    AbstractRepository<T> getAbstractRepository();


}
