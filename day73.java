import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = sc.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = sc.nextInt();

        // Menentukan hasil perbandingan
        if (bilangan1 > bilangan2) {
            System.out.println("\nHasil Perbandingan:");
            System.out.println("Bilangan pertama lebih besar dari bilangan kedua.");
            System.out.println("Bilangan pertama tidak lebih kecil dari bilangan kedua.");
            System.out.println("Bilangan pertama tidak sama dengan bilangan kedua.");
        } else if (bilangan1 < bilangan2) {
            System.out.println("\nHasil Perbandingan:");
            System.out.println("Bilangan pertama tidak lebih besar dari bilangan kedua.");
            System.out.println("Bilangan pertama lebih kecil dari bilangan kedua.");
            System.out.println("Bilangan pertama tidak sama dengan bilangan kedua.");
        } else {
            System.out.println("\nHasil Perbandingan:");
            System.out.println("Bilangan pertama tidak lebih besar dari bilangan kedua.");
            System.out.println("Bilangan pertama tidak lebih kecil dari bilangan kedua.");
            System.out.println("Bilangan pertama sama dengan bilangan kedua.");
        }

        // Menutup objek Scanner
        sc.close();
    }
}
