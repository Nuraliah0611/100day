package day5;

import java.util.Scanner;

public class day35Percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan dua angka sebagai input
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        // Menghitung hasil perkalian
        int hasilPerkalian = angka1 * angka2;

        // Menentukan apakah hasil perkalian genap atau ganjil
        if (hasilPerkalian % 2 == 0) {
            // Jika genap, tambahkan 2
            hasilPerkalian += 2;
        } else {
            // Jika ganjil, tambahkan 5
            hasilPerkalian += 5;
        }

        // Menampilkan hasil
        System.out.println("Hasil perkalian: " + hasilPerkalian);
    }
}
