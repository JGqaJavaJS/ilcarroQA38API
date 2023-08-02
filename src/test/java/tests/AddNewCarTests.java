package tests;

import com.jayway.restassured.response.Response;
import dto.AddCarDTO;
import dto.BookedPeriodsListDTO;
import org.testng.annotations.Test;

public class AddNewCarTests extends BaseTest{

    @Test
    public void addNewCarPositive() {
        AddCarDTO car = AddCarDTO.builder()
                .serialNumber(randomHelper.generateRandomString(10))
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

    }

    @Test
    public void addDuplicateCarTest() {
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

        response = carController.requestNewCar(car, token);
        System.out.println("200 above");

        response.then().assertThat().statusCode(400);
        System.out.println("400 above");

    }

    @Test
    public void addNewCarNegativeWrongToken() {
        AddCarDTO car = AddCarDTO.builder()
                .serialNumber(randomHelper.generateRandomString(10))
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

        Response response = carController.requestNewCar1(car);

        response.then().assertThat().statusCode(401);

    }
}
