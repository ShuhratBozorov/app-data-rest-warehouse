package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Category;


@Projection(types = Category.class)
public interface CustomCategory {
     Integer getId();

     String getName();

     boolean getActive();

     Category getParentCategory();
}
