package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author aoubiza_imane
 */
public class Artiste {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique = true)
    private String biographie;
    
@OneToMany (mappedBy = "auteur", cascade = CascadeType.PERSIST)
private List<Tableau> oeuvres = new LinkedList<>();

}
