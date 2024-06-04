package com.example.webapi.services;

import com.example.webapi.entities.Appointment;
import com.example.webapi.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@Service גורם לכך ש spring ינהל את המחלקה
@Service


public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;
    public List<Appointment> getAppointments() {
        return(List<Appointment>)appointmentRepository.findAll();
    }


    public Appointment getAppointmentById( int id) {
        return appointmentRepository.findById(id).orElse(null);
    }


    public Appointment addAppointment( Appointment appointment) {
       return appointmentRepository.save(appointment);
    }


    public void updateAppointment( int id,  Appointment appointment) {
        appointmentRepository.save(appointment);
    }


    public void deleteAppointment(int id) {
        appointmentRepository.deleteById(id);

    }
}
