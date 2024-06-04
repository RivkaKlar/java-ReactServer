package com.example.webapi.repositories;

import com.example.webapi.entities.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {
}
