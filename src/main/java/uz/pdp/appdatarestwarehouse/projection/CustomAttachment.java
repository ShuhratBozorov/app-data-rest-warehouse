package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

     Integer getId();

     String getName();

     long getSize();

     String getContentType();
}
