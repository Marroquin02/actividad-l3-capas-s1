package com.ascmsm.laboratorio3.service;

import com.ascmsm.laboratorio3.model.Clubs;
import com.ascmsm.laboratorio3.repository.ClubsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubsService {
    private ClubsRepository repository;

    public ClubsService(ClubsRepository repository) {
        this.repository = repository;
    }

    //Endpoint de busqueda con params
    public List<Clubs> getBySearch(String name) {
        return repository.findByNameLike(name);
    }

    public Clubs createClubs(Clubs clubs) {
        return repository.save(clubs);
    }
}
