package galerie.dao;

import galerie.entity.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.PersonneRepository;
import java.util.Optional;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class PersonneRepositoryTest {
    
    @Autowired
    private PersonneRepository personneDAO;
    
    @Test
    @Sql("test-data.sql")
    public void onCompteLesEnregistrementsDePersonne() {
        log.info("Vérification de la table 'Personne'");
        int resultatDansTest = 5;
        long result = personneDAO.count();
        assertEquals(resultatDansTest, result, "On doit trouver 5 personnes");
    }
    
    @Test
    @Sql("test-data.sql")
    public void testBudgetArt() {
        float resultatTest = 130;
        int codePresent = 1;
        Optional<Personne> resultat = personneDAO.findById(codePresent);
        // On s'assure qu'on trouve le résultat
        assertTrue(resultat.isPresent(), "Cette catégorie existe");
        Personne p = resultat.get();
        float result = p.budgetArt(2020);
        assertEquals(resultatTest, result, "Le budget n'est pas identique");
    }
}