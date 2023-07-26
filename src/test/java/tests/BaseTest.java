package tests;

import dto.UserDTO;
import helpers.RandomHelper;
import okhttpapi.AuthenticationController;
import okhttpapi.CarController;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    String email;
    String password = "absAB$777";
    UserDTO userDTO;
    AuthenticationController authentificationController = new AuthenticationController();
    CarController carController = new CarController();
    RandomHelper randomHelper = new RandomHelper();

    @BeforeSuite
    public void start() {
        email = randomHelper.generateRandomEmail();
        userDTO = UserDTO.builder()
                .username(email)
                .password(password)
                .firstName("aaa")
                .lastName("bbb")
                .build();
        authentificationController.setToken(blas);
    }

}
