-- =========================
-- TYPES ENUM
-- =========================

CREATE TYPE genre_enum AS ENUM ('F','M');

CREATE TYPE metier_enum AS ENUM ('Producteur','Collecteur','Autre');

CREATE TYPE poste_enum AS ENUM ('President','PresidentAdjoint','Tresorier','Secretaire','Confirme','Junior');

CREATE TYPE mode_paiement_enum AS ENUM ('ESPECE','VIREMENT','MOBILE_MONEY');

CREATE TYPE type_compte_enum AS ENUM ('CAISSE','BANQUE','MOBILE_MONEY');

CREATE TYPE service_mobile_enum AS ENUM ('ORANGE','MVOLA','AIRTEL');

CREATE TYPE banque_enum AS ENUM ('BRED','MCB','BMOI','BOA','BGFI','AFG','ACCES','BAOBAB','SIPEM');

CREATE TYPE activite_enum AS ENUM ('ASSEMBLEE','FORMATION','EXCEPTIONNELLE','FEDERATION');

CREATE TYPE type_cotisation_enum AS ENUM ('MENSUELLE','ANNUELLE','EXCEPTIONNELLE');


-- =========================
-- LOCALISATION / STRUCTURE
-- =========================

CREATE TABLE ville (
    id_ville SERIAL PRIMARY KEY,
    nom VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE secteur (
    id_secteur SERIAL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL DEFAULT 'Agricole'
);

CREATE TABLE domaine (
    id_domaine SERIAL PRIMARY KEY,
    nom VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE federation (
    id_federation SERIAL PRIMARY KEY,
    nom VARCHAR(150) NOT NULL
);


-- =========================
-- COLLECTIVITE
-- =========================

CREATE TABLE collectivite (
    id_collectivite SERIAL PRIMARY KEY,
    numero INT UNIQUE NOT NULL,
    nom VARCHAR(150) UNIQUE NOT NULL,
    date_creation DATE NOT NULL,
    id_ville INT NOT NULL REFERENCES ville(id_ville),
    id_domaine INT NOT NULL REFERENCES domaine(id_domaine),
    id_federation INT REFERENCES federation(id_federation),
    id_secteur INT REFERENCES secteur(id_secteur)
    autorisation BOOLEAN DEFAULT FALSE
);


-- =========================
-- MEMBRE
-- =========================

CREATE TABLE membre (
    id_membre SERIAL PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    date_naissance DATE,
    genre genre_enum,
    adresse VARCHAR(255),
    telephone VARCHAR(20) UNIQUE,
    email VARCHAR(100) UNIQUE,
    date_adhesion DATE,
    metier metier_enum
);


-- =========================
-- PARRAINAGE
-- =========================

CREATE TABLE parrainage (
    id_parrainage SERIAL PRIMARY KEY,
    id_parrain INT NOT NULL REFERENCES membre(id_membre),
    id_filleul INT NOT NULL REFERENCES membre(id_membre),
    date_parrainage DATE,
    CONSTRAINT chk_parrain_diff CHECK (id_parrain <> id_filleul)
);


-- =========================
-- ADHESION
-- =========================

CREATE TABLE adhesion (
    id_adhesion SERIAL PRIMARY KEY,
    id_membre INT NOT NULL REFERENCES membre(id_membre),
    id_collectivite INT NOT NULL REFERENCES collectivite(id_collectivite),
    date_entree DATE NOT NULL,
    date_sortie DATE,
    poste poste_enum
);


-- =========================
-- MANDAT
-- =========================

CREATE TABLE mandat (
    id_mandat SERIAL PRIMARY KEY,
    annee INT NOT NULL,
    duree INT DEFAULT 1
);

CREATE TABLE mandat_poste (
    id_mandat_poste SERIAL PRIMARY KEY,
    id_mandat INT NOT NULL REFERENCES mandat(id_mandat),
    id_membre INT NOT NULL REFERENCES membre(id_membre),
    id_collectivite INT NOT NULL REFERENCES collectivite(id_collectivite),
    poste poste_enum,
    UNIQUE (id_collectivite, id_mandat, poste)
);


-- =========================
-- ACTIVITES
-- =========================

CREATE TABLE activite (
    id_activite SERIAL PRIMARY KEY,
    titre VARCHAR(150),
    type activite_enum,
    date_activite DATE,
    obligatoire BOOLEAN DEFAULT FALSE,
    id_collectivite INT REFERENCES collectivite(id_collectivite),
    id_federation INT REFERENCES federation(id_federation)
);

CREATE TABLE presence (
    id_presence SERIAL PRIMARY KEY,
    id_membre INT NOT NULL REFERENCES membre(id_membre),
    id_activite INT NOT NULL REFERENCES activite(id_activite),
    present BOOLEAN DEFAULT TRUE,
    excuse BOOLEAN DEFAULT FALSE
);


-- =========================
-- FINANCES
-- =========================

CREATE TABLE cotisation (
    id_cotisation SERIAL PRIMARY KEY,
    id_membre INT NOT NULL REFERENCES membre(id_membre),
    id_collectivite INT NOT NULL REFERENCES collectivite(id_collectivite),
    montant DECIMAL(15,2) NOT NULL,
    date_paiement DATE,
    mode mode_paiement_enum,
    type type_cotisation_enum
);


-- =========================
-- COMPTES
-- =========================

CREATE TABLE compte (
    id_compte SERIAL PRIMARY KEY,
    type type_compte_enum,
    solde DECIMAL(15,2) DEFAULT 0,
    id_collectivite INT REFERENCES collectivite(id_collectivite),
    id_federation INT REFERENCES federation(id_federation)
);

CREATE TABLE compte_bancaire (
    id_compte INT PRIMARY KEY REFERENCES compte(id_compte),
    titulaire VARCHAR(150),
    banque banque_enum,
    numero_compte VARCHAR(23)
);

CREATE TABLE mobile_money (
    id_compte INT PRIMARY KEY REFERENCES compte(id_compte),
    titulaire VARCHAR(150),
    service service_mobile_enum,
    numero_tel VARCHAR(15)
);


-- =========================
-- INDEX (PERFORMANCE)
-- =========================

CREATE INDEX idx_adhesion_membre ON adhesion(id_membre);
CREATE INDEX idx_cotisation_membre ON cotisation(id_membre);
CREATE INDEX idx_presence_membre ON presence(id_membre);
CREATE INDEX idx_activite_date ON activite(date_activite);

