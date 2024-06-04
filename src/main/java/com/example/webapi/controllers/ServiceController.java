package com.example.webapi.controllers;

import com.example.webapi.entities.Service;
import com.example.webapi.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    ServiceService service;
    @GetMapping
    public List<Service> getServices(){
        return service.getAllServices();
    }
    @GetMapping("/{id}")
    public Service getServicesById(@PathVariable int id){
        return service.getServiceById(id);
    }
    @PostMapping()
    public void getServicesById(@RequestBody Service serviceToAdd){
        service.addService(serviceToAdd);
    }
    @PutMapping("/{id}")
    public void getServicesById(@RequestBody Service serviceToAdd,@PathVariable int id){
        service.updateService(id,serviceToAdd);
    }
    @DeleteMapping("/{id}")
    public void DeleteService(@PathVariable int id){
        service.deleteService(id);
    }
}
