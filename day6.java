package day5;

import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner lia = new Scanner(System.in);
        System.out.println("Masukkan nilai anda :");
        double nilaiPreTest = lia.nextDouble();
        
        if (nilaiPreTest > 50){
            System.out.println("LULUS");
        }else {
            System.out.println("TIDAK LULUS");
        }
        //program untuk mengevaluasi nilai mahasiswa jika nilai lebih besar dari 50
        //dinyatakan lulus dan dibawah 50 tidak lulus
    }
}
