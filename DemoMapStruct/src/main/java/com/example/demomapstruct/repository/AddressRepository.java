package com.example.demomapstruct.repository;

import com.example.demomapstruct.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository<Address> extends AbstractRepository {
}
