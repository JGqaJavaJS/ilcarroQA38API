package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class AddCarDTO {

    String serialNumber;
    String manufacture;
    String model;
    String year;
    String fuel;
    int seats;
    String carClass;
    double pricePerDay;
    String about;
    String city;
    double lat;
    double lng;
    String image;
    String owner;
    BookedPeriodsListDTO bookedPeriods;

}
