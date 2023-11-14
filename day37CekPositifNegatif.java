package day5;

import java.util.Scanner;

public class day37CekPositifNegatif {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int nilai = scanner.nextInt();

        if (nilai > 0) {
            System.out.println("Bilangan Positif");
        } else if (nilai < 0) {
            System.out.println("Bilangan Negatif");
        } else {
            System.out.println("Bilangan Nol");
        }
}
}
