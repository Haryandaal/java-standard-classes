package BigNumberClass;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("200000000000000000000");
        BigInteger b = new BigInteger("200000000000000000000");
        BigInteger c = a.multiply(b);

        System.out.println(c);
    }
}
