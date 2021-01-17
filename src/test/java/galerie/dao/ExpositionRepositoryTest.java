package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.ExpositionRepository;
import java.util.Optional;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest

public class ExpositionRepositoryTest {
    
    @Autowired
    private ExpositionRepository expositionDAO;

    @Test
    @Sql("test-data.sql") // On peut charger des donnnées spécifiques pour un test
    public void onSaitCompterLesEnregistrements() {
        log.info("On compte les enregistrements de la table 'Galerie'");
        int combienDansLeJeuDeTest = 4; 
        long nombre = expositionDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 4 galeries" );
    }
    
    @Test
    @Sql("test-data.sql")
    public void testChiffreAffaire() {
        log.info("On teste le chiffre d'affaire");
        float budgetTotal = 130;
        Optional<Exposition> resultat = expositionDAO.findById(1);
        // On s'assure qu'on trouve le résultat
        assertTrue(resultat.isPresent(), "Cette catégorie existe");
        Exposition expo = resultat.get();
        float result = expo.caExposition();
        assertEquals(budgetTotal, result, "Le chiffre d'affaire n'est pas identique");
    }
    
    @Test
    @Sql("test-data.sql")
    public void testChiffreAffaire1() {
        log.info("On teste le chiffre d'affaire");
        float budgetTotal = 130;
        float expo = expositionDAO.chiffreAffairePour(1);
        assertEquals(budgetTotal, expo, "Le chiffre d'affaire n'est pas identique");
    }
    
}