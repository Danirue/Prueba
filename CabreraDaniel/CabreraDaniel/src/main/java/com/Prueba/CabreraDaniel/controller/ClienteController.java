package com.Prueba.CabreraDaniel.controller;

import com.Prueba.CabreraDaniel.models.Cliente;
import com.Prueba.CabreraDaniel.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping("/clientecarta")
    public Cliente create(@Validated @RequestBody Cliente p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<Cliente> readAll(){
        return repository.findAll();
    }

    @PutMapping("/cliente/{id}")
    public Cliente update(@PathVariable Long id, @Validated @RequestBody Cliente p){
        return repository.save(p);
    }

    @DeleteMapping("/cliente/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
