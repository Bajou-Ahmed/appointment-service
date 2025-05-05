package com.emsi.appointment_service.entity;

public class Specialite {

    private Long id;
    private String nom;  // Nom de la spécialité, par exemple : "Cardiologie", "Pédiatrie", etc.
    private String description;  // Description de la spécialité, peut être utile pour plus de détails.

    // Constructors
    public Specialite() {
    }

    public Specialite(Long id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method
    @Override
    public String toString() {
        return "Specialite{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
