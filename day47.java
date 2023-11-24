package day5;
import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai (batas 40): ");
        int nilai = scanner.nextInt();

        if (nilai > 40) {
            System.out.println("Nilai melebihi batas 40. Program berhenti.");
            return;
        }

        System.out.println("Angka ganjil:");
        for (int i = 1; i <= nilai * 2; i += 2) {
            System.out.println(i + " ");
        }

        System.out.println("\nAngka genap:");
        for (int i = 2; i <= nilai * 2; i += 2) {
            System.out.println(i + " ");
        }
    }
}

