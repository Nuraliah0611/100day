package day5;

import java.util.Scanner;

public class day36GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int nilai = scanner.nextInt();

        int totalGenap = 0;
        int totalGanjil = 0;

        for (int i = 1; i <= nilai; i++) {
            if (i % 2 == 0) {
                totalGenap += i;
                System.out.println("Nilai genap: " + i);
            } else {
                totalGanjil += i;
                System.out.println("Ganjil: " + i);
            }
        }

        System.out.println("Hasil Genap: " + totalGenap);
        System.out.println("Hasil Ganjil: " + totalGanjil);
    }
}
