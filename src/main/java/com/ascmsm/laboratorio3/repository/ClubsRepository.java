package com.ascmsm.laboratorio3.repository;

import com.ascmsm.laboratorio3.model.Clubs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubsRepository extends JpaRepository<Clubs, Long> {
    List<Clubs> findByNameLike(String name);
}
