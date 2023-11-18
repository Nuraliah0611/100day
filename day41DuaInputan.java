package day5;

import java.util.Scanner;

public class day41DuaInputan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("masukkan bilangan pertama: ");
        int angka = sc.nextInt();
        
        System.out.println("masukkan bilangan kedua: ");
        int angka2 = sc.nextInt();
        
        for (int i = angka; i < angka2; i++) {
            System.out.print(i + " , ");
            
            if (i != angka2-1) {
                System.out.print(" ");
            }
        }
    }
}
