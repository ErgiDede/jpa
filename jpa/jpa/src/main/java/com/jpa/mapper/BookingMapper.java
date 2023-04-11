package com.jpa.mapper;

import com.jpa.model.dto.BookingDTO;
import com.jpa.model.dto.UserDTO;
import com.jpa.model.entity.Booking;
import com.jpa.model.entity.User;

import java.sql.Date;

public class BookingMapper  extends AbstractMapper<User, UserDTO> {
    @Override
    public User toEntity(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO toDto(User user) {
        return null;
    }


    public BookingDTO toDto(Booking booking) {
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setId(booking.getId());
        bookingDTO.setBookingDate((Date) booking.getBookingDate());
        bookingDTO.setStatus(booking.getStatus());
        return bookingDTO;
    }
}


