package day5;
import java.util.Scanner;

public class day56while {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan beberapa angka, dipisahkan oleh spasi
        System.out.print("Masukkan beberapa angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine();

        // Memecah input menjadi array string menggunakan spasi sebagai pemisah
        String[] numbersAsString = input.split(" ");

        // Membuat array integer untuk menyimpan angka-angka yang diubah dari string
        int[] numbers = new int[numbersAsString.length];

        // Mengkonversi setiap string menjadi integer dan menyimpannya dalam array numbers
        int i = 0;
        while (i < numbersAsString.length) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
            i++;
        }

        // Menggunakan while untuk mengiterasi melalui elemen array
        System.out.println("\nMenggunakan While:");
        i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
