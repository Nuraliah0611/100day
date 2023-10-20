
package day5;

import java.util.Scanner;

public class day12Scanner {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        String nama = masukkan.nextLine();
        
        System.out.println("Salam kenal " + nama);
        
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan umur ");
        int umur = masukan.nextInt();
        
        System.out.println("ingat umur " + umur);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        Float bilangan = input.nextFloat();
        
        System.out.println("desimal fav " + bilangan);
    }
}
