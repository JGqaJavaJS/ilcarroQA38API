package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class BookedPeriodsDTO {
    String email;
    String startDate;
    String endDate;
    //"2023-07-30"

}
