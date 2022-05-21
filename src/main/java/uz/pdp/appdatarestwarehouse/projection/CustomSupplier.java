package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();

}
