package day5;
import java.util.Scanner;
public class day46TernaryOperator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan angka: ");
        int number = sc.nextInt();

        // Menggunakan ternary operator untuk menentukan apakah angka genap atau ganjil
        String nilai = (number % 2 == 0) ? "Genap" : "Ganjil";

        // Menampilkan hasil
        System.out.println("Angka ini adalah " + nilai);

        sc.close();
    }
}
