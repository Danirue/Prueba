package com.Prueba.CabreraDaniel.repository;

import com.Prueba.CabreraDaniel.models.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends MongoRepository<Restaurante, Long> {
}
