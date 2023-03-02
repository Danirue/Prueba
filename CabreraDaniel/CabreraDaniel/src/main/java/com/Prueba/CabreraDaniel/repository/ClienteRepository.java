package com.Prueba.CabreraDaniel.repository;

import com.Prueba.CabreraDaniel.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
