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

    public void createCollectivite(CollectiviteDTO dto) {

        if (dto.getNom() == null || dto.getNom().isBlank()) {
            throw new RuntimeException("Nom obligatoire");
        }

        if (dto.getNumero() == null) {
            throw new RuntimeException("Numéro obligatoire");
        }

        if (dto.getDateCreation() == null) {
            throw new RuntimeException("Date de création obligatoire");
        }

        repository.findByNom(dto.getNom())
                .ifPresent(c -> {
                    throw new RuntimeException("Collectivité déjà existante");
                });

        repository.save(dto);
    }

    public List<CollectiviteDTO> getAllCollectivites() {
        return repository.findAll();
    }
}