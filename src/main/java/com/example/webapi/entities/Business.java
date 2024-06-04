package com.example.webapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Business {
    @Id
    private int  id;
    private String  name;
    private String address;
    private String phone;
    private String owner;
    private String logo;
    private String description;

}
