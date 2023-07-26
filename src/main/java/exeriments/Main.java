package exeriments;

import com.google.gson.Gson;
import dto.TokenResponseDTO;
import dto.UserDTO;
import okhttp3.Response;
import okhttpapi.AuthenticationController;

import java.io.IOException;

public class Main {

    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException {

        UserDTO userDTO = UserDTO.builder()
                .username("email@skdjk.cc")
                .password("aaAA77$$njdn")
                .firstName("aaa")
                .lastName("bbb")
                .build();
        AuthenticationController authentificationController = new AuthenticationController();
        Response response = authentificationController.responseAuthSignIn(userDTO);
        System.out.println("code" + response.code());
        TokenResponseDTO responseDTO = gson.fromJson(response.body().string(), TokenResponseDTO.class);
        System.out.println("response dto: "+ responseDTO);
    }

}
