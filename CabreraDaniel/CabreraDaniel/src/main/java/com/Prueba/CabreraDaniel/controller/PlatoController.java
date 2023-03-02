package com.Prueba.CabreraDaniel.controller;

import com.Prueba.CabreraDaniel.models.Plato;
import com.Prueba.CabreraDaniel.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/platos")
public class PlatoController {

    @Autowired
    private PlatoRepository repository;

    @PostMapping("/plato")
    public Plato create(@Validated @RequestBody Plato p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Plato> readAll(){
        return repository.findAll();
    }

    @PutMapping("/plato/{id}")
    public Plato update(@PathVariable Long id, @Validated @RequestBody Plato p){
        return repository.save(p);
    }

    @DeleteMapping("/plato/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
