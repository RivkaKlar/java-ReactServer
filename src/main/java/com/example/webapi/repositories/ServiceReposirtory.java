package com.example.webapi.repositories;

import com.example.webapi.entities.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceReposirtory extends CrudRepository<Service,Integer> {
}
