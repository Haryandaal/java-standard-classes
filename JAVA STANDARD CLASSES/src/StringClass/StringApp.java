package StringClass;


public class StringApp {
    public static void main(String[] args) {

        String name = "Haryanda Alfitroh";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Haryanda"));
        System.out.println(name.endsWith("Alfitroh"));
        System.out.println(name.charAt(10));

        String[] names = name.split(" ");
        for(var value : names ){
            System.out.println(value);
        }
    }
}
