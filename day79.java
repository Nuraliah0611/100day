
import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();
        
        System.out.println("Masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();
        
        System.out.println("Masukkan bilangan ketiga: ");
        int bil3 = sc.nextInt();
        
        int terbesar = Math.max(Math.max(bil1, bil2), bil3);
        
        System.out.println("\nBilangan terbesar: " + terbesar);
    }
}
