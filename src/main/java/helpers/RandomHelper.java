package helpers;

import java.util.Random;

public class RandomHelper {

    public String generateRandomEmail() {
        String allowedCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String domain = "gmail.com";

        Random random = new Random();
        //StringBuilder sb = new StringBuilder();
        String email = "";
        int length = allowedCharacters.length();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(length);
            email = email + allowedCharacters.charAt(randomIndex);
            //sb.append(allowedCharacters.charAt(randomIndex));
        }

        email = email + "@" + domain;

        //sb.append('@').append(domains[random.nextInt(domains.length)]);

        return email;
    }

    public String generateRandomString(int lengthIn) {
        String allowedCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();
        String str = "";
        int length = allowedCharacters.length();

        for (int i = 0; i < lengthIn; i++) {
            int randomIndex = random.nextInt(length);
            str = str + allowedCharacters.charAt(randomIndex);
        }
        return str;
    }

}
