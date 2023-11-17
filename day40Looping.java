
package day5;

import java.util.Scanner;

public class day40Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int total = sc.nextInt();
        System.out.println("Total: "+total);
        
        while(true){
            System.out.println("masukkan angka atau ketik selesai untuk mengakhiri program");
            
            String input = sc.next();
            
            if (input.equalsIgnoreCase("selesai")) {
                break;
            }
            try{
                int bilangan = Integer.parseInt(input);
                total += bilangan;
                System.out.println("Total: "+total);
            } catch(NumberFormatException e){
                System.out.println("Input tidak valid.");
            }
        }
        System.out.println("Program selesai. Total akhir : "+ total);
        sc.close();
    }
}
