package com.example.RideBookingBackend.Models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Ride extends BaseModel {

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date endTime;

    @Column(nullable = false)
    private Long totalDistance;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

}
