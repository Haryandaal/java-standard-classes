package NumberClass;

public class NumberClassApp {
    public static void main(String[] args) {

        Integer intValue = 20000;

        Long longValue = intValue.longValue();

        System.out.println(longValue);


        String contoh = "345000";
        Integer contohint = Integer.valueOf(contoh);

        System.out.println(contohint);

        // kalo tipe datanya object pakenya .valueof
        // Kalo tipe datanya primitif pakenya .parseInt
    }
}
