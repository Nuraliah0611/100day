
package day5;

import java.util.Scanner;

public class day10_Scanner {
    public static void main(String[] args) {
        Scanner lia = new Scanner(System.in);
        System.out.println("Masukkan nama anda :");
        String liaa = lia.nextLine();
        System.out.println("Masukkan nilai anda :");
        double nilai = lia.nextDouble();
        if (nilai >= 80){
            System.out.println("Nilai anda A");
        }else if (nilai >= 60){
            System.out.println("Nilai anda B");
        }else if (nilai >= 40){
            System.out.println("Nilai anda C");
        }else {
            System.out.println("Nilai anda E");
        }
    }
}
