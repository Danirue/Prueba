package com.Prueba.CabreraDaniel.controller;

import com.Prueba.CabreraDaniel.models.Restaurante;
import com.Prueba.CabreraDaniel.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteRepository repository;

    @PostMapping("/restaurante")
    public Restaurante create(@Validated @RequestBody Restaurante p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Restaurante> readAll(){
        return repository.findAll();
    }

    @PutMapping("/restaurante/{id}")
    public Restaurante update(@PathVariable Long id, @Validated @RequestBody Restaurante p){
        return repository.save(p);
    }

    @DeleteMapping("/Restaurante/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
