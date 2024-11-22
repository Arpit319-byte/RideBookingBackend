package com.example.RideBookingBackend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

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

    @OneToMany(mappedBy = "driver")
    private List<Ride> rides;

}
