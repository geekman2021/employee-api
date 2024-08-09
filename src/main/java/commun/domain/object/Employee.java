package commun.domain.object;


import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String role;

    public Employee () {};
    public Employee(String nom, String prenom, String role) {
        this.nom = nom;
        this.prenom= prenom;
        this.role= role;
    };

    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }

    public String  getRole() {
        return this.role;
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
}
