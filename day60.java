package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> inputList = new ArrayList<>();
        String input;
        do{
            System.out.println("Masukkan teks (ketik 'selesai' untuk mengakhiri): ");
            input = sc.nextLine();
            
            if (!input.equalsIgnoreCase("selesai")) {
                inputList.add(input);
            }
        }while(!input.equalsIgnoreCase("selesai"));
        
        System.out.println("Isi array list: ");
        for ( String item : inputList){
            System.out.println(item);
    }
        sc.close();
    }
}
