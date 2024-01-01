
import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();
        
        while(jumlahElemen <= 0){
            System.out.println("Input tidak valid. Masukkan jumlah elemen array yang lebih dari 0");
            System.out.println("Masukkan jumlah elemen array: ");
            jumlahElemen = sc.nextInt();
        }
        int[] array = new int[jumlahElemen];
        
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Masukkan elemen array ke- " + (i+1) + ":");
            array[i] = sc.nextInt();
        }
        int terbesar = array[0];
        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > terbesar){
                terbesar = array[i];
            }
        }
        System.out.println("\nBilangan terbesar dalam array: " + terbesar);
        sc.close();
    }
}
