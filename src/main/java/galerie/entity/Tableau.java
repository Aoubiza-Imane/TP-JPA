package galerie.entity;

import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Tableau {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
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

    @ManyToMany(mappedBy = "oeuvres")
    List<Exposition> accrochages; //relation avec exposition

    @OneToOne
    private Transaction vendu;

    @ManyToOne
    private Artiste auteur;
}
