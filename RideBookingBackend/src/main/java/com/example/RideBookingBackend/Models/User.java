package com.example.RideBookingBackend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User extends BaseModel{

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false,unique = true)
    private String userContact;

    @Column(nullable = false,unique = true)
    private String userEmail;

    @Column(nullable = false)
    private String userAddress;

    @OneToMany(mappedBy = "user")
    private List<Ride> rides;

}