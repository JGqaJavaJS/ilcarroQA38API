package okhttpapi;

import com.google.gson.Gson;
import dto.UserDTO;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.testng.annotations.BeforeSuite;

public class BaseAPI {

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    String baseUrl = "https://ilcarro-backend.herokuapp.com";

    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
