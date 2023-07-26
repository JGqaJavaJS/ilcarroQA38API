package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class MessageErrorDTO {
    String message;
    /*
            "message":{
        "additionalProp1":"string",
                "additionalProp2":"string",
                "additionalProp3":"string"
    },
     */
}
