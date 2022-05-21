package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Client;
import uz.pdp.appdatarestwarehouse.entity.Currency;
import uz.pdp.appdatarestwarehouse.entity.Output;
import uz.pdp.appdatarestwarehouse.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    Client getClient();

    String getFactureNumber();

    String getCode();
}
