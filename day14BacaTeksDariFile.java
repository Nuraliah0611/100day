
package day5;

import java.io.FileReader;
import java.io.IOException;

public class day14BacaTeksDariFile {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader ("F:\\NetBeansProjects/PBO.txt");
            int karakter;
            while ((karakter = file.read()) != -1){
                System.out.println((char) karakter);
            }
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
