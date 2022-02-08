package com.devsuperior.dscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
