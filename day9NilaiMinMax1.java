
package day5;

import java.util.Scanner;

public class day9NilaiMinMax1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan bilangan a:");
        double a = input.nextDouble();
        
        System.out.println("masukkan bilangan b:");
        double b = input.nextDouble();
        
        double min, max;
        
        if (a > b) {
            System.out.println("nilai a adalah nilai max: " + a);  
            System.out.println("nilai b adalah nilai min: " + b);
           
        }else if (a < b){
            System.out.println("nilai a adalah nilai max a: " + a);
            System.out.println("nilai b adalah nilai min b: " + b);
    }
    }
}
