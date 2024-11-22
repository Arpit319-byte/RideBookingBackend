package com.example.RideBookingBackend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Review {

    @Column(nullable = false)
    private String comment;

    private Double rating;
}
