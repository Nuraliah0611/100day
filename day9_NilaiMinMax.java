
package day5;

import java.util.Scanner;

public class day9_NilaiMinMax {
    public static void main(String[] args) {  
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();

        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();

        double min, max;

        // Menentukan nilai minimum dan maksimum
        min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        if (e < min) {
            min = e;
        }

        max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }

        System.out.println("Nilai minimum (min) adalah: " + min);
        System.out.println("Nilai maksimum (max) adalah: " + max);

        input.close();
    }
}

