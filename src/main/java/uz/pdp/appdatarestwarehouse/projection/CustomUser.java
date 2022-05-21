package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.User;
import uz.pdp.appdatarestwarehouse.entity.WareHouse;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstName();

    String getLastName();

    String getCode();

    String getPhoneNumber();

    String getPassword();

    boolean getActive();

    Set<WareHouse> getWareHouses();


}
