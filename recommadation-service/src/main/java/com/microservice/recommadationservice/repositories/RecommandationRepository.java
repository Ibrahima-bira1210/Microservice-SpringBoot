package com.microservice.recommadationservice.repositories;

import com.microservice.recommadationservice.entities.Recommadation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommandationRepository extends JpaRepository<Recommadation,Long> {
}
