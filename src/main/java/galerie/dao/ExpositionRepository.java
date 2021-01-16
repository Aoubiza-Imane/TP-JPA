package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aoubiza_imane
 */
public interface ExpositionRepository extends JpaRepository<Exposition, Integer>{
    
}
