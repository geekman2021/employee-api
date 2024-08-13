package com.arkeup.employee_api.data.dto;

public class EmployeeDTO {
    private String nom;
    private String prenom;
    private String adresse;
    private String role;
    private Integer age;

    public EmployeeDTO () {};

    public EmployeeDTO(String nom, String prenom, String adresse, String role, Integer age) {
        this.nom = nom;
        this.prenom= prenom;
        this.adresse = adresse;
        this.role= role;
        this.age = age;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getAdresse() {
        return this.adresse;
    }
    public String getRole() {
        return this.role;
    }
    public Integer getAge() {
        return this.age;
    }

    public void setNom(String nom) {
        this.nom= nom;
    }
    public void setPrenom(String prenom) {
        this.prenom= prenom;
    }
    public void setAdresse(String adresse) {
        this.adresse= adresse;
    }
    public void setRole(String role) {
        this.role= role;
    }
    public void setAge(Integer age) {
        this.age= age;
    }

}
