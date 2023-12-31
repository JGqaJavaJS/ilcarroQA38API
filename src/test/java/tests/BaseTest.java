package tests;

import com.jayway.restassured.RestAssured;
import dto.UserDTO;
import helpers.RandomHelper;
import okhttpapi.AuthenticationController;
import okhttpapi.CarController;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    String email;
    String password = "absAB$777";
    UserDTO userDTO;
    AuthenticationController authentificationController = new AuthenticationController();
    CarController carController = new CarController();
    RandomHelper randomHelper = new RandomHelper();
    String token;

    @BeforeSuite
    public void start() {
        email = randomHelper.generateRandomEmail();
        userDTO = UserDTO.builder()
                .username(email)
                .password(password)
                .firstName("aaa")
                .lastName("bbb")
                .build();
        token = authentificationController.setTokenFromResponse(userDTO);

        authentificationController.setPath();

    }

    @AfterSuite
    public void end() {
        System.out.println(email);

        // TODO delete user - when developers add this functionality
        // bug report: 123/78
    }

}