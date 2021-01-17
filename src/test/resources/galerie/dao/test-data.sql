-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'Kings Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Galerie2', 'adresseGalerie2');
INSERT INTO Galerie(id, nom, adresse) VALUES (3, 'Galerie3', 'adresseGalerie3');

INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (1, TO_DATE('2020/01/16', 'YYYY/MM/DD'), 'intituleExpo1', 11, 1);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (2, TO_DATE('2020/06/15', 'YYYY/MM/DD'), 'intituleExpo2', 12, 2);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (3, TO_DATE('2020/03/22', 'YYYY/MM/DD'), 'intituleExpo3', 13, 3);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (4, TO_DATE('2020/03/22', 'YYYY/MM/DD'), 'intituleExpo4', 10, 1);

INSERT INTO Personne(id, nom, adresse) VALUES (1, 'Personne1', 'adressePersonne1');
INSERT INTO Personne(id, nom, adresse) VALUES (2, 'Personne2', 'adressePersonne2');
INSERT INTO Personne(id, nom, adresse) VALUES (3, 'Personne3', 'adressePersonne3');
INSERT INTO Personne(id, nom, adresse) VALUES (4, 'Personne4', 'adressePersonne4');
INSERT INTO Personne(id, nom, adresse) VALUES (5, 'Personne5', 'adressePersonne5');

INSERT INTO Artiste(id, biographie) VALUES (1,'biographieArtiste1');

INSERT INTO Tableau(id, largeur, longueur,support, titre, auteur_id) VALUES (1, 20,20,'supportTableau1','titreTableau1', 1);
INSERT INTO Tableau(id, largeur, longueur,support, titre, auteur_id) VALUES (2, 40,40,'supportTableau2','titreTableau2', 1);

INSERT INTO Exposition_Oeuvres(accrochages_id, oeuvres_id) VALUES (1,1);
INSERT INTO Exposition_Oeuvres(accrochages_id, oeuvres_id) VALUES (2,2);

INSERT INTO Transaction(id, prix_vente, vendu_le, client_id, lieu_de_vente_id, oeuvre_id) VALUES (1, 123, TO_DATE('2020/01/17', 'YYYY/MM/DD'), 1,1,1);
INSERT INTO Transaction(id, prix_vente, vendu_le, client_id, lieu_de_vente_id, oeuvre_id) VALUES (2, 7, TO_DATE('2020/01/18', 'YYYY/MM/DD'), 1,1,2);
