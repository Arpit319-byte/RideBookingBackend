package com.example.RideBookingBackend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Driver extends BaseModel {

    @Column(nullable = false)
    private String driverName;

    @Column(nullable = false)
    private String driverContact;

    @Column(nullable = false)
    private String driverEmail;

    @Column(nullable = false)
    private String driverLicense;

    @Column(nullable = false)
    private String driverAddress;

}
