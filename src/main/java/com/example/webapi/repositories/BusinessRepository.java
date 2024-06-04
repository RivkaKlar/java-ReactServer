package com.example.webapi.repositories;

import com.example.webapi.entities.Business;
import jakarta.persistence.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends CrudRepository<Business,Integer> {
}
