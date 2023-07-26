package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class ErrorDTO {
        String timestamp;
        int status;
        String error;
        MessageErrorDTO messageErrorDTO;
        String path;
}
