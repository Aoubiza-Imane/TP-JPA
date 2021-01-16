package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    @NonNull
    private String nom;

    @Column(unique = true)
    @NonNull
    private String adresse;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private List<Transaction> transactions = new LinkedList<>();
    
    public float budgetArt(int annee){
        float budgetArt = 0;
        for (Transaction t: transactions){
            if (t.getVenduLe().getYear() == annee){
                budgetArt = budgetArt + t.getPrixVente();
            }
        }
        return budgetArt; 
    }  
}


