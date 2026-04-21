package hei.school.agricole.service;

import hei.school.agricole.dto.CollectiviteDTO;
import hei.school.agricole.repository.CollectiviteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectiviteService {

    private final CollectiviteRepository repository;

    public CollectiviteService(CollectiviteRepository repository) {
        this.repository = repository;
    }

    // CREATE (A - ouverture collectivité)
    public CollectiviteDTO createCollectivite(CollectiviteDTO dto) {

        validate(dto);

        repository.findByNom(dto.getNom())
                .ifPresent(c -> {
                    throw new RuntimeException("Collectivité déjà existante");
                });

        repository.save(dto);

        return dto;
    }

    // GET ALL
    public List<CollectiviteDTO> getAllCollectivites() {
        return repository.findAll();
    }

    // GET BY ID
    public CollectiviteDTO getById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Collectivité introuvable"));
    }

    // validation métier
    private void validate(CollectiviteDTO dto) {
        if (dto.getNom() == null || dto.getNom().isBlank()) {
            throw new RuntimeException("Nom obligatoire");
        }

        if (dto.getNumero() == null) {
            throw new RuntimeException("Numéro obligatoire");
        }

        if (dto.getDateCreation() == null) {
            throw new RuntimeException("Date de création obligatoire");
        }

        if (dto.getIdVille() == null) {
            throw new RuntimeException("Ville obligatoire");
        }

        if (dto.getIdDomaine() == null) {
            throw new RuntimeException("Domaine obligatoire");
        }

        if (dto.getIdFederation() == null) {
            throw new RuntimeException("Fédération obligatoire");
        }
    }

    // UPDATE
    public CollectiviteDTO update(int id, CollectiviteDTO dto) {

        // vérifier existence
        repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Collectivité introuvable"));

        validate(dto);

        repository.update(id, dto);

        return dto;
    }

    // DELETE
    public void delete(int id) {
        repository.delete(id);
    }
}