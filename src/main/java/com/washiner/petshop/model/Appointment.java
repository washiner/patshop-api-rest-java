package com.washiner.petshop.model;

import java.time.LocalDateTime;

public class Appointment {
    private Long id;
    private LocalDateTime dateTime;
    private String reason;

    // Construtores, getters e setters
    public Appointment() {}

    public Appointment(Long id, LocalDateTime dateTime, String reason) {
        this.id = id;
        this.dateTime = dateTime;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

