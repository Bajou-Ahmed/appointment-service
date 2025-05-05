package com.emsi.appointment_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class DossierMedical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomPatient;
    private String sexe;
    private String dateNaissance;
    private String groupeSanguin;
    
    // Liste des antécédents médicaux du patient
    private List<String> antecedentsMediocaux;

    // Liste des prescriptions ou traitements en cours
    private List<String> prescriptions;

    // Constructors
    public DossierMedical() {
    }

    public DossierMedical(String nomPatient, String sexe, String dateNaissance, String groupeSanguin,
                          List<String> antecedentsMediocaux, List<String> prescriptions) {
        this.nomPatient = nomPatient;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.groupeSanguin = groupeSanguin;
        this.antecedentsMediocaux = antecedentsMediocaux;
        this.prescriptions = prescriptions;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public List<String> getAntecedentsMediocaux() {
        return antecedentsMediocaux;
    }

    public void setAntecedentsMediocaux(List<String> antecedentsMediocaux) {
        this.antecedentsMediocaux = antecedentsMediocaux;
    }

    public List<String> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<String> prescriptions) {
        this.prescriptions = prescriptions;
    }

    // toString method
    @Override
    public String toString() {
        return "DossierMedical{" +
                "id=" + id +
                ", nomPatient='" + nomPatient + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", groupeSanguin='" + groupeSanguin + '\'' +
                ", antecedentsMediocaux=" + antecedentsMediocaux +
                ", prescriptions=" + prescriptions +
                '}';
    }
}
