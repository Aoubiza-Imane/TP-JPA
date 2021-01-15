package galerie.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author aoubiza_imane
 */
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    @NonNull
    private LocalDate venduLe;

    @Column(unique = true)
    @NonNull
    private float prixVente;

    @ManyToOne
    private Exposition lieuDeVente;

    @OneToOne
    private Tableau oeuvre;

    @ManyToOne
    private Personne client;

}
