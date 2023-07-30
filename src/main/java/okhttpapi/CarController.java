package okhttpapi;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import dto.AddCarDTO;

public class CarController extends BaseAPI{

    Response responseAddNewCar;

    public Response requestNewCar(AddCarDTO addCarDTO) {
        System.out.println("token from request add car " + token);
        return RestAssured.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoiZWl4MGxtZHE3Y0BnbWFpbC5jb20iLCJpc3MiOiJSZWd1bGFpdCIsImV4cCI6MTY5MTMzODYxNywiaWF0IjoxNjkwNzM4NjE3fQ.u05gihZRUjvFKnE6VOyIUBtv5_o7SQq1RUopyu0GSPc")
                .body(addCarDTO)
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/cars");
    }

    public Response requestNewCar1(AddCarDTO addCarDTO) {
        return RestAssured.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJybWyJST0xFX1VTRVIiXSwic3ViIjoiZWl4MGxtZHE3Y0BnbWFpbC5jb20iLCJpc3MiOiJSZWd1bGFpdCIsImV4cCI6MTY5MTMzODYxNywiaWF0IjoxNjkwNzM4NjE3fQ.u05gihZRUjvFKnE6VOyIUBtv5_o7SQq1RUopyu0GSPc")
                .body(addCarDTO)
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/cars");
    }

    public Response requestDeleteCar(String serNumber) {
        return RestAssured.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoiZWl4MGxtZHE3Y0BnbWFpbC5jb20iLCJpc3MiOiJSZWd1bGFpdCIsImV4cCI6MTY5MTMzODYxNywiaWF0IjoxNjkwNzM4NjE3fQ.u05gihZRUjvFKnE6VOyIUBtv5_o7SQq1RUopyu0GSPc")
                .contentType(ContentType.JSON)
                .when()
                .delete("/v1/cars/"+serNumber);
    }
}
