package com.arkeup.employee_api.data.dto;

public class EmployeeDTO {
   private String nom;
    private String prenom;
    private String role;

    public EmployeeDTO () {};

    public EmployeeDTO(String nom, String prenom, String role) {
        this.nom = nom;
        this.prenom= prenom;
        this.role= role;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getRole() {
        return this.role;
    }

    public void setNom(String nom) {
        this.nom= nom;
    }
    public void setPrenom(String prenom) {
        this.prenom= prenom;
    }
    public void setRole(String role) {
        this.role= role;
    }

}
