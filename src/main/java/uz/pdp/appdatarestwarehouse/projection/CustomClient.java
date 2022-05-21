package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Client;


@Projection(types = Client.class)
public interface CustomClient {
     Integer getId();

     String getName();

     boolean getActive();

     String getPhoneNumber();
}
