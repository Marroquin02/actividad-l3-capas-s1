package com.ascmsm.laboratorio3.controller;

import com.ascmsm.laboratorio3.model.Clubs;
import com.ascmsm.laboratorio3.service.ClubsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
public class ClubsController {
    private final ClubsService service;

    public ClubsController(ClubsService service) {
        this.service = service;
    }

    //Endpoint de busqueda con params
    @GetMapping("/search")
    public List<Clubs> findByName(@RequestParam String name) {
        return service.getBySearch(name);
    }

    @PostMapping
    public Clubs  createClubs(@RequestBody Clubs clubs){
        return service.createClubs(clubs);
    }

    @GetMapping("/country/{country}")
    public List<Clubs> findByCountry(@PathVariable String country){ return service.getByCountry(country);}
}
