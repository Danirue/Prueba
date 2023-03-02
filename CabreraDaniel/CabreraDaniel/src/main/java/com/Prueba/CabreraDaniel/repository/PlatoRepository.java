package com.Prueba.CabreraDaniel.repository;

import com.Prueba.CabreraDaniel.models.Plato;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoRepository extends MongoRepository<Plato, Long> {
}
