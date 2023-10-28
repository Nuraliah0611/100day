package day5;

import java.util.Scanner;

public class day20kalkulatorSederhana {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int angka1,angka2,operator;
        System.out.println("Kalkulator sederhana");
        System.out.println("a. penjumlahan");
        System.out.println("b. pengurangan");
        System.out.println("c. perkalian");
        System.out.println("d. pembagian");
        
        System.out.println("masukkan angka1 :");
        angka1=masukkan.nextInt();
        System.out.println("masukkan bilangan operator :");
        operator=masukkan.nextInt();
        System.out.println("masukkan angka2 :");
        angka2=masukkan.nextInt();
        
        if(operator == 1){
            System.out.println("hasil =" +(angka1 + angka2));
        }
        else if(operator == 2){
            System.out.println("hasil =" +(angka1 - angka2));
        }
        else if(operator == 3){
            System.out.println("hasil =" +(angka1 * angka2));
        }
        else if(operator == 4){
            System.out.println("hasil =" +(angka1 / angka2));
        }
        
    }
    
}
