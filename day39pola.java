
package day5;

import java.util.Scanner;

public class day39pola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int nilai = sc.nextInt();
        
        for (int i = 1; i < nilai+1 ; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
        sc.close();
    }
}
