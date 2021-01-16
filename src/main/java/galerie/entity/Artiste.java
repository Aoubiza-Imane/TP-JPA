package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Artiste extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String biographie;

    @OneToMany(mappedBy = "auteur", cascade = CascadeType.PERSIST)
    List<Tableau> oeuvres = new LinkedList<>();
}
