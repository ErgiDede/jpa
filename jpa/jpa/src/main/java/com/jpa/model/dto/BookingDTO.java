package com.jpa.model.dto;

import com.jpa.model.enums.BookingStatus;
import com.jpa.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {

    private Long id;

    private Date bookingDate;

    private BookingStatus status;


    @Override
    public String toString() {
        return "BookingDTO{" +
                "id=" + id +
                ", bookingDate=" + bookingDate +
                ", status=" + status +
                '}';
    }
}


