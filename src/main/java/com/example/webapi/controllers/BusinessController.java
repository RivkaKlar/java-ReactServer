package com.example.webapi.controllers;

import com.example.webapi.entities.Business;
import com.example.webapi.entities.Service;
import com.example.webapi.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    BusinessService businessService;
    @GetMapping
    public List<Business> getServices(){
        return businessService.getBusiness();
    }
    @GetMapping("/{id}")
    public Business getServicesById(@PathVariable int id){
        return businessService.getBusinessById(id);
    }
    @PostMapping()
    public void getServicesById(@RequestBody Business businessToAdd){
        businessService.addBusiness(businessToAdd);
    }
    @PutMapping("/{id}")
    public void getServicesById(@RequestBody Business BusinessToAdd, @PathVariable int id){
        businessService.updateBusiness(id,BusinessToAdd);
    }
    @DeleteMapping("/{id}")
    public void DeleteService(@PathVariable int id){
        businessService.deleteBusiness(id);
    }
}
