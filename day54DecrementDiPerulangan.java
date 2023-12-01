package day5;
import java.util.Scanner;
public class day54DecrementDiPerulangan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan batas perulangan
        System.out.print("Masukkan nilai batas perulangan: ");
        int batasPerulangan = sc.nextInt();

        // Menutup objek Scanner setelah pengguna selesai memasukkan nilai
        sc.close();

        // Perulangan for dengan operasi decrement
        for (int i = batasPerulangan; i >= 1; i--) {
            System.out.println("Nilai i: " + i);
        }

        System.out.println("Perulangan selesai.");
    }
}
