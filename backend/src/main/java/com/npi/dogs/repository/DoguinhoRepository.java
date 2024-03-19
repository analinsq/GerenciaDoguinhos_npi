package com.npi.dogs.repository;

import com.npi.dogs.model.Doguinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoguinhoRepository extends JpaRepository<Doguinho, Integer> {
}
