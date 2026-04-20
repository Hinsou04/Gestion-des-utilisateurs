package Model;

// Creation d'une classe user
public class User {

    // Les attributs de la classe user
    private static Long id;
    private String nom;
    private String email;

    // Le constructeur
    public User (Long id, String nom,String email){
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // Implementation des methodes Getter et Setter et toString.
    // Getter pour id
    public static Long getId(){
        return id;
    }
    // Setter pour id
    public void setId(Long id){this.id = id;}
    // Getter pour nom
    public String getNom(){
        return nom;
    }
    // Setter pour nom
    public void setNom(String nom){
        this.nom = nom;
    }
    // Getter pour email
    public String getEmail(){
        return email;
    }
    // Setter pour email
    public void setEmail(String email){
        this.email = email;
    }

    // Methode pour toString
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
