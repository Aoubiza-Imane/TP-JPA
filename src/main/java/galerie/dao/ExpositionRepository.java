package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import galerie.entity.Exposition;

// This will be AUTO IMPLEMENTED by Spring 

public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
    
    /**
     * Calculer le chiffre d'affaires pour une exposition
     * @param id la clé primaire de l'exposition
     * @return le chiffre d'affaires de cette exposition
     */
    @Query(
            value =
            "SELECT sum(prix_vente)"
            + "FROM Transaction INNER JOIN Exposition ON (Transaction.lieu_de_vente_id = Exposition.id)"
            + "WHERE Exposition.id = :id",
            nativeQuery = true
            )
    float chiffreAffairePour(Integer id);
    
}