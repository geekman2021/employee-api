package com.arkeup.employee_api.data.domain.object;


import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String email;
    @Column(name = "adresse")
    private String adress;
    private String role;
    private Integer age;

    public Employee () {};
    public Employee(String nom, String prenom, String role, String adress, String email, Integer age) {
        this.nom = nom;
        this.prenom= prenom;
        this.role= role;
        this.adress= adress;
        this.email = email;
        this.age = age;
    };

    public Integer getId() {
        return this.id;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }

    public String  getRole() {
        return this.role;
    }

    public String getEmail() {
        return this.email;
    }
    public String getAdress() {
        return this.adress;
    }
    public Integer getAge() {
        return this.age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setRole(String role) {
        this.role= role;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAdress(String adress) {
        this.adress= adress;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
