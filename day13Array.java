package day13bacafile;

import java.util.Scanner;

public class day13Array {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        // Membuat array dengan panjang yang sudah ditentukan
        int[] dataArray = new int[length];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            int element = scanner.nextInt();
            dataArray[i] = element;
        }

        // Mencetak elemen-elemen array
        System.out.println("Elemen-elemen array:");
        for (int i = 0; i < length; i++) {
            System.out.println("Elemen ke-" + i + ": " + dataArray[i]);
    }
    }
}
