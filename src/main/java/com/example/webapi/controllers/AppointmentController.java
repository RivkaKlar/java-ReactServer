package com.example.webapi.controllers;

import com.example.webapi.entities.Appointment;
import com.example.webapi.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController//הגדרה זו גורמת ל class להיות controller
@RequestMapping("/appointment")//הכתובת שעליה ירוץ  controller זה
@CrossOrigin
public class AppointmentController {
    //הזרקת תלות
    @Autowired
    AppointmentService appointmentService;

    @GetMapping//פונקציית get
    public List<Appointment> getAppointments() {
        return appointmentService.getAppointments();
    }

    //  @PathVariable=  משתנה המועבר בשורת הניתוב (url)
    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable int id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment) {
      return   appointmentService.addAppointment(appointment);
    }

    //  @RequestBody=  משתנה המועבר בגוף הבקשה (body)
    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable int id, @RequestBody Appointment upAppointment) {
       appointmentService.updateAppointment(id,upAppointment);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable int id) {
      appointmentService.deleteAppointment(id);
    }

}
