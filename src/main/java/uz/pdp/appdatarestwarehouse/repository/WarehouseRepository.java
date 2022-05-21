package uz.pdp.appdatarestwarehouse.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.appdatarestwarehouse.entity.WareHouse;
import uz.pdp.appdatarestwarehouse.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<WareHouse,Integer> {

    @RestResource(path="byName")
    public Page<WareHouse> findAllByName(@Param("name") String name, Pageable pageable);
}
