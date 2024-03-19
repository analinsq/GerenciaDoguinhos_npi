package com.npi.dogs.controller;

import com.npi.dogs.model.Doguinho;
import com.npi.dogs.service.DoguinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/doguinhos")
public class DoguinhoController {

    @Autowired
    private DoguinhoService doguinhoService;

    @GetMapping
    public List<Doguinho> getAllDoguinhos() {
        return doguinhoService.getAllDoguinhos();
    }

    @GetMapping("/{id}")
    public Doguinho getDoguinhoById(@PathVariable int id) {
        return doguinhoService.getDoguinhoById(id);
    }

    @PostMapping
    public Doguinho createDoguinho(@RequestBody Doguinho doguinho) {
        return doguinhoService.createDoguinho(doguinho);
    }

    @PutMapping("/{id}")
    public Doguinho updateDoguinho(@PathVariable int id, @RequestBody Doguinho doguinho) {
        return doguinhoService.updateDoguinho(id, doguinho);
    }

    @DeleteMapping("/{id}")
    public void deleteDoguinho(@PathVariable int id) {
        doguinhoService.deleteDoguinho(id);
    }
}
