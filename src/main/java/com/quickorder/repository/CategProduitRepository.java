package com.quickorder.repository;

import com.quickorder.model.CategProduit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "categProduit")
public interface CategProduitRepository extends CrudRepository<CategProduit, Long> {
}