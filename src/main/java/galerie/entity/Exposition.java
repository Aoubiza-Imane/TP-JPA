package galerie.entity;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA

public class Exposition { 
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private int duree;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column (unique = true)
    @NonNull
    private LocalDate debut;
    
@ManyToOne 
private Galerie organisateur; //relation avec galerie

@OneToMany(mappedBy ="lieuDeVente", cascade = CascadeType.PERSIST)
private List<Transaction> ventes = new LinkedList<>();

    
    
}
