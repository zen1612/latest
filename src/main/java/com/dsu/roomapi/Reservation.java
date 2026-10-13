package com.dsu.roomapi;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name = "room_id")
    private Room room;

    private String reservedBy;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    protected Reservation(){ }
    // + constructor(room, reservedBy, startTime, endTime), getters
    }
}