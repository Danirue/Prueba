package com.Prueba.CabreraDaniel.controller;

import com.Prueba.CabreraDaniel.models.Carta;
import com.Prueba.CabreraDaniel.repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/cartas")
public class CartaController {

    @Autowired
    private CartaRepository repository;

    @PostMapping("/carta")
    public Carta create(@Validated @RequestBody Carta p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Carta> readAll(){
        return repository.findAll();
    }

    @PutMapping("/carta/{id}")
    public Carta update(@PathVariable Long id, @Validated @RequestBody Carta p){
        return repository.save(p);
    }

    @DeleteMapping("/carta/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

}
