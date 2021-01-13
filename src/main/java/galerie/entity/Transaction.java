package galerie.entity;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author aoubiza_imane
 */
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique = true)
    @NonNull
    private LocalDate venduLe; 
    
    @Column(unique=true)
    @NonNull
    private float prixVente;
   
@ManyToOne 
private Exposition lieuDeVente;

@OneToOne
private Tableau oeuvre;

@ManyToOne
private Personne client;
    
    
}
