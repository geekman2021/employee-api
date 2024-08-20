package com.arkeup.employee_api.data.dto;

public class EmployeeCreationDTO {

    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private Integer age;
    private String role;

    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getEmail() {
        return this.email;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public Integer getAge() {
        return this.age;
    }
    public String getRole() {
        return this.role;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
