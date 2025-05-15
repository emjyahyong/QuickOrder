package com.quickorder.repository;

import com.quickorder.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "produit")
public interface ProduitRepository extends CrudRepository<Produit, Long> {
}