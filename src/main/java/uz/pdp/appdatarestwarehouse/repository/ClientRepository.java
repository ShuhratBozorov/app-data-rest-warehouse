package uz.pdp.appdatarestwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarestwarehouse.entity.Client;
import uz.pdp.appdatarestwarehouse.projection.CustomClient;

@RepositoryRestResource(path = "client",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
