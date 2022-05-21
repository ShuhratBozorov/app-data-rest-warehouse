package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Currency;
import uz.pdp.appdatarestwarehouse.entity.Input;
import uz.pdp.appdatarestwarehouse.entity.Supplier;
import uz.pdp.appdatarestwarehouse.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

     Integer getId();

     Timestamp getDate();

     WareHouse getWareHouse();

     Supplier getSupplier();

     Currency getCurrency();

     String getFactureNumber();

     String getCode();
}
