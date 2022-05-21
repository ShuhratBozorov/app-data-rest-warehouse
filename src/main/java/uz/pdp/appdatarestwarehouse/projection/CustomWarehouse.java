package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.WareHouse;

@Projection(types = WareHouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

    boolean getActive();
}
