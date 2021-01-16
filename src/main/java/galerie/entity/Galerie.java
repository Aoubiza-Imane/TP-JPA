package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Galerie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    @NonNull
    private String nom;

    @Column(unique = true)
    @NonNull
    private String adresse;

    @OneToMany(mappedBy = "organisateur", cascade = CascadeType.PERSIST)
    private List<Exposition> evenements = new LinkedList<>();

    public float caAnnuel(int annee) {
        float caAnnuel = 0;
        for (Exposition e : evenements) {
            if (e.getDebut().getYear() == annee) {
                caAnnuel += e.caExposition();
            }
        }
        return caAnnuel;
    }
}
