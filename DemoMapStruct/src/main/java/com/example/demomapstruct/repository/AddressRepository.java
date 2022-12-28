package com.example.demomapstruct.repository;

import com.example.demomapstruct.entity.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;

@Repository
public interface AddressRepository extends AbstractRepository<Address> {

}
