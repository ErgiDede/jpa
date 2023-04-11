package com.jpa.model.entity;

import com.jpa.model.enums.FlightStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "flights")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "airline")
    private String airline;


    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "arrival_date" )
    private Date arrivalDate;

    @Column(name = "status")
    private FlightStatus status;

    @ManyToMany(mappedBy = "flights")
    private Set<Booking> bookings = new HashSet<>();

}
