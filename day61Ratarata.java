package day5;

import java.util.Scanner;

public class day61Ratarata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int count = 0;
        
        System.out.println("Masukkan bilangan bulat (ketik '0' untuk mengakhiri): ");
        
        int input = sc.nextInt();
        
        while (input != 0){
            //memasukkan input ke total
            total += input;
            //menambah 1 ke hitungan
            count++;
            //menampilkan input berikutnya
            System.out.println("Masukkan bilangan bulat (ketik '0' untuk mengakhiri): ");
            input = sc.nextInt();
        }
        //menghutung rata
        double average = (count > 0) ? (double) total / count : 0.0;
        //menampilkan hasil
        System.out.println("Rata rata bbilangan adalah: " + average);
        
        sc.close();
    }
}
