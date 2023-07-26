package okhttpapi;
import dto.TokenResponseDTO;
import dto.UserDTO;
import okhttp3.*;

import java.io.IOException;

public class AuthenticationController extends BaseAPI{

    Response responseAuth;

    public Response responseAuthSignIn(UserDTO userDTO) {
        RequestBody requestBody = RequestBody.create(gson.toJson(userDTO), JSON);
        Request request = new Request.Builder()
                .url(baseUrl + "/v1/user/registration/usernamepassword")
                .post(requestBody)
                .build();
        try {
            responseAuth = client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return responseAuth;
    }

    public void setTokenFromResponse(UserDTO userDTO) {
        if(responseAuth == null) {
            responseAuthSignIn(userDTO);
        }
        String tokenLocal;
        try {
            TokenResponseDTO responseDTO = gson.fromJson(responseAuth.body().string(), TokenResponseDTO.class);
            tokenLocal = responseDTO.getAccessToken();
            System.out.println("------ token " + tokenLocal);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setToken(tokenLocal);
    }



}
