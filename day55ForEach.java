package day5;
import java.util.Scanner;

public class day55ForEach {
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
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        // Menggunakan for-each untuk mengiterasi melalui elemen array
        System.out.println("\nMenggunakan For Each:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
