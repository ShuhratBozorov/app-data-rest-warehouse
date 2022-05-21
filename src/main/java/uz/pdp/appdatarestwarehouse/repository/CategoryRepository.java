package uz.pdp.appdatarestwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarestwarehouse.entity.Category;
import uz.pdp.appdatarestwarehouse.projection.CustomCategory;

@RepositoryRestResource(path = "category",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
