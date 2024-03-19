package com.npi.dogs.service;

import com.npi.dogs.model.Doguinho;
import com.npi.dogs.repository.DoguinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoguinhoService {

    @Autowired
    private DoguinhoRepository doguinhoRepository;

    public List<Doguinho> getAllDoguinhos() {
        return doguinhoRepository.findAll();
    }

    public Doguinho getDoguinhoById(int id) {
        Optional<Doguinho> doguinhoOptional = doguinhoRepository.findById(id);
        if (doguinhoOptional.isPresent()) {
            return doguinhoOptional.get();
        } else {
            throw new RuntimeException("Doguinho não encontrado :( " + id);
        }
    }

    public Doguinho createDoguinho(Doguinho doguinho) {
        return doguinhoRepository.save(doguinho);
    }

    public Doguinho updateDoguinho(int id, Doguinho doguinho) {
        if (doguinhoRepository.existsById(id)) {
            doguinho.setId(id);
            return doguinhoRepository.save(doguinho);
        } else {
            throw new RuntimeException("Doguinho não encontrado :( " + id);
        }
    }

    public void deleteDoguinho(int id) {
        if (doguinhoRepository.existsById(id)) {
            doguinhoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Doguinho não encontrado :( " + id);
        }
    }
}
