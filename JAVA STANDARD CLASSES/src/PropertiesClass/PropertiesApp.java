package PropertiesClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

       try {
           Properties properties = new Properties();
           properties.load(new FileInputStream("application.properties"));

          String name =  properties.getProperty("database.name");
           String adress =  properties.getProperty("database.adress");
           String age =  properties.getProperty("database.age");

           System.out.println(name);
           System.out.println(adress);
           System.out.println(age);
       } catch (FileNotFoundException exception) {
           System.out.println("File tidak ditemukan");
       } catch (IOException exception) {
           System.out.println("Gagal load data dari file");
       }

       try {
           Properties properties = new Properties();

           properties.put("dream.one", "be success" );

           properties.store(new FileOutputStream("name.properties"), "Just Random");

       } catch (FileNotFoundException exception) {
           System.out.println("Error membuat file properties");
       } catch (IOException exception) {
           System.out.println("Error menyimpan file");
       }
    }
}
