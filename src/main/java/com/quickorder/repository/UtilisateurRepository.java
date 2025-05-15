package com.quickorder.repository;

import com.quickorder.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "utilisateur")
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
}