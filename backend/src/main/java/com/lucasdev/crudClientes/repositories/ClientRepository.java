package com.lucasdev.crudClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasdev.crudClientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
}
