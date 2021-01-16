package galerie.dao;

import galerie.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aoubiza_imane
 */
public interface PersonneRepository extends JpaRepository<Personne, Integer>{
    
}
