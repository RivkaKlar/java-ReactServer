package com.example.webapi.services;

import com.example.webapi.entities.Appointment;
import com.example.webapi.entities.Business;
import com.example.webapi.repositories.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService {
  @Autowired
  BusinessRepository businessRepository;
    public List<Business> getBusiness() {
        return (List<Business>) businessRepository.findAll();
    }


    public Business getBusinessById( int id) {
        return businessRepository.findById(id).orElse(null);
    }


    public void addBusiness( Business business) {
        businessRepository.save(business);
    }


    public void updateBusiness( int id,  Business business) {
        businessRepository.save(business);
    }


    public void deleteBusiness(int id) {
        businessRepository.deleteById(id);

    }
}
