package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Haryanda Alfitroh";

        StringTokenizer tokenizer = new StringTokenizer(name , " ");

        while(tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);

            //Mirip dengan split, cuman lazy lazy :), jadi gak makan banyak memory
        }
    }


}
