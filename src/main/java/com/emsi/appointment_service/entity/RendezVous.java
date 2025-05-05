package com.emsi.appointment_service.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class RendezVous {
    private Long id;
    private LocalDateTime date;
    private String description;
    private String status;

    // Constructors
    public RendezVous() {
    }

    public RendezVous(Long id, LocalDateTime date, String description, String status) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return "RendezVous{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // equals & hashCode (basés sur id)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RendezVous)) return false;
        RendezVous that = (RendezVous) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
