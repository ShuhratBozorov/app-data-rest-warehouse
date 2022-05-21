package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

     Integer getId();

     String getName();

     boolean getActive();
}
