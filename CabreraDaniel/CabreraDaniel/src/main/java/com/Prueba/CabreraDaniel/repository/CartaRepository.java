package com.Prueba.CabreraDaniel.repository;

import com.Prueba.CabreraDaniel.models.Carta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaRepository extends MongoRepository<Carta, Long> {
}
