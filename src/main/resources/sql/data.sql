-- =========================
-- VILLES / SECTEURS / DOMAINES / FEDERATIONS
-- =========================

INSERT INTO ville (nom) VALUES
('Antananarivo'),
('Toamasina'),
('Fianarantsoa');

INSERT INTO secteur (nom) VALUES
('Agricole'),
('Elevage'),
('Pêche');

INSERT INTO domaine (nom) VALUES
('Riziculture'),
('Horticulture'),
('Agro-industrie');

INSERT INTO federation (nom) VALUES
('Fédération Agricole Centrale'),
('Union des Coopératives de Madagascar');


-- =========================
-- COLLECTIVITES
-- =========================

INSERT INTO collectivite (numero, nom, date_creation, id_ville, id_domaine, id_federation, autorisation)
VALUES
(1001, 'Coopérative Soa Firenena', '2020-05-12', 1, 1, 1, TRUE),
(1002, 'Union Vary Be', '2019-03-20', 2, 2, 2, TRUE),
(1003, 'Agriculteurs Fitiavana', '2021-08-01', 3, 3, NULL, FALSE);


-- =========================
-- MEMBRES
-- =========================

INSERT INTO membre (nom, prenom, date_naissance, genre, adresse, telephone, email, date_adhesion, metier)
VALUES
('Rakoto', 'Jean', '1985-04-10', 'M', 'Antananarivo Centre', '0340011223', 'rakoto.jean@mail.com', '2020-06-01', 'Producteur'),
('Rasoanaivo', 'Marie', '1990-09-15', 'F', 'Toamasina Port', '0340044556', 'marie.raso@mail.com', '2021-02-10', 'Collecteur'),
('Andrianina', 'Paul', '1978-12-20', 'M', 'Fianarantsoa Haut', '0340099887', 'paul.andri@mail.com', '2019-11-05', 'Autre'),
('Ravelo', 'Lina', '1995-07-08', 'F', 'Antananarivo Est', '0340022334', 'lina.ravelo@mail.com', '2022-01-15', 'Producteur');


-- =========================
-- PARRAINAGE
-- =========================

INSERT INTO parrainage (id_parrain, id_filleul, date_parrainage)
VALUES
(1, 2, '2021-03-01'),
(1, 3, '2020-07-15'),
(2, 4, '2022-02-01');


-- =========================
-- ADHESION
-- =========================

INSERT INTO adhesion (id_membre, id_collectivite, date_entree, date_sortie, poste)
VALUES
(1, 1, '2020-06-01', NULL, 'President'),
(2, 1, '2021-02-10', NULL, 'Secretaire'),
(3, 2, '2019-11-05', NULL, 'Tresorier'),
(4, 3, '2022-01-15', NULL, 'Junior');


-- =========================
-- MANDATS
-- =========================

INSERT INTO mandat (annee, duree)
VALUES
(2023, 1),
(2024, 1);

INSERT INTO mandat_poste (id_mandat, id_membre, id_collectivite, poste)
VALUES
(1, 1, 1, 'President'),
(1, 2, 1, 'Secretaire'),
(2, 3, 2, 'Tresorier');


-- =========================
-- ACTIVITES
-- =========================

INSERT INTO activite (titre, type, date_activite, obligatoire, id_collectivite, id_federation)
VALUES
('Assemblée Générale 2024', 'ASSEMBLEE', '2024-01-10', TRUE, 1, 1),
('Formation Riziculture', 'FORMATION', '2024-02-15', TRUE, 2, 2),
('Réunion exceptionnelle', 'EXCEPTIONNELLE', '2024-03-05', FALSE, 3, NULL);


-- =========================
-- PRESENCE
-- =========================

INSERT INTO presence (id_membre, id_activite, present, excuse)
VALUES
(1, 1, TRUE, FALSE),
(2, 1, TRUE, FALSE),
(3, 2, FALSE, TRUE),
(4, 3, TRUE, FALSE);


-- =========================
-- COTISATIONS
-- =========================

INSERT INTO cotisation (id_membre, id_collectivite, montant, date_paiement, mode)
VALUES
(1, 1, 50000, '2024-01-10', 'ESPECE'),
(2, 1, 30000, '2024-01-12', 'MOBILE_MONEY'),
(3, 2, 45000, '2024-02-01', 'VIREMENT'),
(4, 3, 20000, '2024-03-01', 'ESPECE');


-- =========================
-- COMPTES
-- =========================

INSERT INTO compte (type, solde, id_collectivite, id_federation)
VALUES
('CAISSE', 150000, 1, NULL),
('BANQUE', 500000, NULL, 1),
('MOBILE_MONEY', 80000, 2, NULL);


-- =========================
-- COMPTE BANCAIRE / MOBILE MONEY
-- =========================

INSERT INTO compte_bancaire (id_compte, titulaire, banque, numero_compte)
VALUES
(2, 'Fédération Centrale', 'BOA', 'MG1234567890');

INSERT INTO mobile_money (id_compte, titulaire, service, numero_tel)
VALUES
(3, 'Union Vary Be', 'MVOLA', '0340011223');