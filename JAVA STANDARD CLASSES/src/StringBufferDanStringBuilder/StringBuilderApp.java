package StringBufferDanStringBuilder;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Haryanda"); //agar tidak memakan memory di java (manipulasi String)
        builder.append(" ");
        builder.append("Alfitroh");

        System.out.println(builder.toString());
    }
}
