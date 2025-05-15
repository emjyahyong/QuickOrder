package com.quickorder.repository;

import com.quickorder.model.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "commande")
public interface CommandeRepository extends CrudRepository<Commande, Long> {
}