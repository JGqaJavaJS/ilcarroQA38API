package tests;

import com.jayway.restassured.response.Response;
import dto.AddCarDTO;
import org.testng.annotations.Test;

public class DeleteCarTests extends BaseTest{

    @Test
    public void addNewCarPositive() {
        String serNumber = randomHelper.generateRandomString(10);

        AddCarDTO car = AddCarDTO.builder()
                .serialNumber(serNumber)
                .manufacture("opel")
                .model("corsa")
                .year("1990")
                .fuel("Petrol")
                .seats(2)
                .carClass("first")
                .pricePerDay(25)
                .about("blabla")
                .city("Tel Aviv")
                .build();

        Response response = carController.requestNewCar(car, token);

        response.then().assertThat().statusCode(200);

        response = carController.requestDeleteCar(serNumber);

        response.then().assertThat().statusCode(400);

    }
}
