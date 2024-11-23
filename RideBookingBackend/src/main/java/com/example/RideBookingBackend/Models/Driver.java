package com.example.RideBookingBackend.Models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
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
