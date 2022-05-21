package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Attachment;
import uz.pdp.appdatarestwarehouse.entity.AttachmentContent;


@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
     Integer getId();

     byte[] getBytes();

     Attachment getAttachment();
}
