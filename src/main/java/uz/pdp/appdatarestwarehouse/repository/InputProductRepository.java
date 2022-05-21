package uz.pdp.appdatarestwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarestwarehouse.entity.InputProduct;
import uz.pdp.appdatarestwarehouse.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
