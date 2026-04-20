package hei.school.agricole.controller;

import hei.school.agricole.dto.CollectiviteDTO;
import hei.school.agricole.service.CollectiviteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collectivites")
public class CollectiviteController {

    private final CollectiviteService service;

    public CollectiviteController(CollectiviteService service) {
        this.service = service;
    }

    @PostMapping
    public String test(@RequestBody CollectiviteDTO dto) {
        return dto.getNom();
    }

    @GetMapping
    public List<CollectiviteDTO> getAll() {
        return service.getAllCollectivites();
    }
}