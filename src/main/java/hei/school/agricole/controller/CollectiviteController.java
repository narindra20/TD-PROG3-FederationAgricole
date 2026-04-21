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
    public void create(@RequestBody CollectiviteDTO dto) {
        service.createCollectivite(dto);
    }

    @GetMapping
    public List<CollectiviteDTO> getAll() {
        return service.getAllCollectivites();
    }

    @GetMapping("/{id}")
    public CollectiviteDTO getById(@PathVariable int id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public CollectiviteDTO update(@PathVariable int id,
                                  @RequestBody CollectiviteDTO dto) {
        return service.update(id, dto);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}