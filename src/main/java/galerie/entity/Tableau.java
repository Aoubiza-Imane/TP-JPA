package galerie.entity;
import javax.persistence.*;
import lombok.*;


/**
 *
 * @author aoubiza_imane
 */
public class Tableau {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;
    
    @Column(unique = true)
    @NonNull
    private String support;
    
    @Column(unique = true)
    @NonNull
    private int largeur;
    
    @Column(unique = true)
    @NonNull
    private int hauteur;
    
    @OneToOne(mappedBy = "oeuvre")
    private Transaction vendu;    
    
    @OneToMany
    private Artiste oeuvres;
}

