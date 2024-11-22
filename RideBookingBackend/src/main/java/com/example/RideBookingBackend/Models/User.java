package com.example.RideBookingBackend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


}
