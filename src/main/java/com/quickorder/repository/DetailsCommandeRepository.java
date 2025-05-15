package com.quickorder.repository;

import com.quickorder.model.DetailsCommande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "detailsCommande")
public interface DetailsCommandeRepository extends CrudRepository<DetailsCommande, Long> {
}