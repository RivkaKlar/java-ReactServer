package com.example.webapi.services;

import com.example.webapi.entities.Service;
import com.example.webapi.repositories.ServiceReposirtory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    ServiceReposirtory serviceReposirtory;

    public List<Service> getAllServices(){
        return (List<Service>) serviceReposirtory.findAll();
    }
    public Service getServiceById(int id){
        return  serviceReposirtory.findById(id).orElse(null);
    }
    public void addService(Service service){
        serviceReposirtory.save(service);

    }
    public void updateService(int id,Service service){
        serviceReposirtory.save(service);
    }
    public void deleteService(int id){
        serviceReposirtory.deleteById(id);
    }
        }
