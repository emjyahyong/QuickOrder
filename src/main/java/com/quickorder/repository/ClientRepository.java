package com.quickorder.repository;

import com.quickorder.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource(path = "client")
public interface ClientRepository extends CrudRepository<Client, Long> {
}