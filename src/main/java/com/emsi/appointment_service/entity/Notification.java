package com.emsi.appointment_service.entity;

import java.time.LocalDateTime;

public class Notification {

    private Long id;
    private String titre;
    private String message;
    private LocalDateTime dateCreation;
    private boolean estLue; // Indique si la notification a été lue
    private String destinataire; // Par exemple, "Médecin", "Administrateur", ou "Utilisateur"

    // Constructors
    public Notification() {
    }

    public Notification(Long id, String titre, String message, LocalDateTime dateCreation, boolean estLue, String destinataire) {
        this.id = id;
        this.titre = titre;
        this.message = message;
        this.dateCreation = dateCreation;
        this.estLue = estLue;
        this.destinataire = destinataire;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isEstLue() {
        return estLue;
    }

    public void setEstLue(boolean estLue) {
        this.estLue = estLue;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    // toString method
    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", message='" + message + '\'' +
                ", dateCreation=" + dateCreation +
                ", estLue=" + estLue +
                ", destinataire='" + destinataire + '\'' +
                '}';
    }
}
