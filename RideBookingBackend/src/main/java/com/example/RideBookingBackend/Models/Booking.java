package com.example.RideBookingBackend.Models;


import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Booking extends BaseModel {

    private Date startTime;

    private Date endTime;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

}
