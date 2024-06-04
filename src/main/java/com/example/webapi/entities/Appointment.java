package com.example.webapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
//TO GET THIS OPTION ADD THIS:  //TO POM.XML
//<!--lombok - ספריה עבור הוספת setter/getter/constructorאוטומטיים -->
//<dependency>
//<groupId>org.projectlombok</groupId>
//<artifactId>lombok</artifactId>
//<optional>true</optional>
//</dependency>


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//
public class Appointment {
    @Id
    private int id;
    private String serviceType;
    private LocalDateTime dateTime;//מבנה של תאריך ושעה סטנדרטי בjs
    private String clientName;
    private String clientPhone;
    private String clientEmail;

}