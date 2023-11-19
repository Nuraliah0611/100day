package day5;
import java.util.Scanner;
public class day42Pola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah baris dari pengguna
        System.out.print("Masukkan jumlah baris: ");
        int nilai = sc.nextInt();

        // Loop untuk setiap baris
        for (int i = 1; i <= nilai; i++) {
            // Mencetak karakter '+'
            System.out.print("+");

            // Mencetak karakter '-' dan '+', membentuk pola tangga
            for (int j = 0; j < i; j++) {
                System.out.print("---+");
            }

            // Pindah ke baris berikutnya
            System.out.println();

            // Mencetak karakter '|'
            System.out.print("|");

            // Mencetak karakter spasi dan '|', membentuk pola tangga
            for (int j = 0; j < i; j++) {
                System.out.print("   |");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }

        // Mencetak karakter '+' dan '-' untuk bagian bawah pola
        System.out.print("+");
        for (int i = 0; i < nilai; i++) {
            System.out.print("---+");
        }

        // Pindah ke baris terakhir
        System.out.println();
        
    }
}
