package net.grogscave.omnibroker.repositories;

import net.grogscave.omnibroker.domain.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "service", path = "service")
public interface ServiceRepository extends MongoRepository<Service, String> {

}
