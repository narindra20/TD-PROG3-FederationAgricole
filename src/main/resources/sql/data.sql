-- =========================
-- VILLES
-- =========================
INSERT INTO ville (id_ville, nom) VALUES
(1,'Antananarivo'),
(2,'Toamasina'),
(3,'Fianarantsoa');

-- =========================
-- DOMAINES
-- =========================
INSERT INTO domaine (id_domaine, nom) VALUES
(1,'Riziculture'),
(2,'Vanille'),
(3,'Elevage');

-- =========================
-- FEDERATION
-- =========================
INSERT INTO federation (id_federation, nom)
VALUES (1,'Federation Agricole Madagascar');

-- =========================
-- COLLECTIVITE
-- =========================
INSERT INTO collectivite
(id_collectivite, numero, nom, date_creation, id_ville, id_domaine, id_federation, autorisation)
VALUES
(1,100,'Agri Tana','2023-01-01',1,1,1,TRUE);

-- =========================
-- MEMBRES (10 minimum)
-- =========================
INSERT INTO membre VALUES
(1,'Rakoto','Jean','1990-05-10','M','Tana','0340000001','jean@mail.com','2023-01-01','Producteur'),
(2,'Rabe','Marie','1995-06-12','F','Tana','0340000002','marie@mail.com','2023-01-01','Collecteur'),
(3,'Rasoa','Paul','1988-03-22','M','Tana','0340000003','paul@mail.com','2023-01-01','Producteur'),
(4,'Rala','Anna','1992-11-05','F','Tana','0340000004','anna@mail.com','2023-01-01','Autre'),
(5,'Ravo','Luc','1985-02-17','M','Tana','0340000005','luc@mail.com','2023-01-01','Producteur'),
(6,'Rina','Sofia','1998-09-30','F','Tana','0340000006','sofia@mail.com','2023-01-01','Collecteur'),
(7,'Rivo','Marc','1991-12-01','M','Tana','0340000007','marc@mail.com','2023-01-01','Producteur'),
(8,'Hery','Lala','1993-07-07','F','Tana','0340000008','lala@mail.com','2023-01-01','Autre'),
(9,'Tiana','Joel','1996-04-18','M','Tana','0340000009','joel@mail.com','2023-01-01','Producteur'),
(10,'Kanto','Mia','1999-08-25','F','Tana','0340000010','mia@mail.com','2023-01-01','Collecteur');

-- =========================
-- ADHESION
-- =========================
INSERT INTO adhesion VALUES
(1,1,1,'2023-01-01',NULL,'President'),
(2,2,1,'2023-01-01',NULL,'Tresorier'),
(3,3,1,'2023-01-01',NULL,'Secretaire'),
(4,4,1,'2023-01-01',NULL,'PresidentAdjoint'),
(5,5,1,'2023-01-01',NULL,'Confirme'),
(6,6,1,'2023-01-01',NULL,'Confirme'),
(7,7,1,'2023-01-01',NULL,'Junior'),
(8,8,1,'2023-01-01',NULL,'Junior'),
(9,9,1,'2023-01-01',NULL,'Junior'),
(10,10,1,'2023-01-01',NULL,'Junior');

-- =========================
-- PARRAINAGE (respect 90 jours)
-- =========================
INSERT INTO parrainage VALUES
(1,5,7,'2023-06-01'),
(2,5,8,'2023-06-01'),
(3,6,9,'2023-06-01'),
(4,6,10,'2023-06-01');

-- =========================
-- MANDAT 2024
-- =========================
INSERT INTO mandat VALUES (1,2024,1);

INSERT INTO mandat_poste VALUES
(1,1,1,1,'President'),
(2,1,4,1,'PresidentAdjoint'),
(3,1,2,1,'Tresorier'),
(4,1,3,1,'Secretaire');

-- =========================
-- ACTIVITES
-- =========================
INSERT INTO activite VALUES
(1,'Assemblée Janvier','ASSEMBLEE','2024-01-15',TRUE,1,NULL),
(2,'Formation Juniors','FORMATION','2024-01-20',TRUE,1,NULL);

-- =========================
-- PRESENCE
-- =========================
INSERT INTO presence VALUES
(1,1,1,TRUE,FALSE),
(2,2,1,TRUE,FALSE),
(3,3,1,TRUE,FALSE),
(4,4,1,TRUE,FALSE),
(5,5,1,TRUE,FALSE),
(6,6,1,TRUE,FALSE),
(7,7,1,TRUE,FALSE),
(8,8,1,FALSE,TRUE),
(9,9,1,TRUE,FALSE),
(10,10,1,TRUE,FALSE);

-- =========================
-- COTISATION (50 000 MGA)
-- =========================
INSERT INTO cotisation VALUES
(1,1,1,50000,'2024-01-10','MOBILE_MONEY','MENSUELLE'),
(2,2,1,50000,'2024-01-10','VIREMENT','MENSUELLE'),
(3,3,1,50000,'2024-01-10','ESPECE','MENSUELLE');

-- =========================
-- COMPTE CAISSE
-- =========================
INSERT INTO compte VALUES
(1,'CAISSE',150000,1,NULL);

-- =========================
-- COMPTE MOBILE MONEY
-- =========================
INSERT INTO compte VALUES
(2,'MOBILE_MONEY',200000,1,NULL);

INSERT INTO mobile_money VALUES
(2,'Agri Tana','MVOLA','0340009999');

