package com.pbo.pmo.repository;

import com.pbo.pmo.model.Scrum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrumRepository extends JpaRepository<Scrum,Integer> {
    Scrum findByProject_id(int id);
}
