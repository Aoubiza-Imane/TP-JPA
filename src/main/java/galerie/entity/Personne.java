package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;


/**
 *
 * @author aoubiza_imane
 */
public class Personne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique = true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
 @OneToMany (mappedBy = "client", cascade = CascadeType.PERSIST)
 private List<Transaction> achats = new LinkedList<>();
 
    
}
