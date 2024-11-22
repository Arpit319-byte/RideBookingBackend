package com.example.RideBookingBackend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Vehicle extends BaseModel{

    @Column(nullable = false,unique = true)
    private String vehicleNumber;

    @Column(nullable = false)
    private String vehicleModel;

    @Column(nullable = false)
    private String vehicleType;

    @OneToOne(mappedBy = "vehicle")
    private Driver driver;


}
