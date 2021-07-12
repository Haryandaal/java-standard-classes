package Base64Class;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String ori = "Haryanda Alfitroh";

        String encoded = Base64.getEncoder().encodeToString(ori.getBytes());
        System.out.println(encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);

        System.out.println(result);
    }
}
