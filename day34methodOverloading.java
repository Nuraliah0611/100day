package day5;

public class day34methodOverloading{

    // Method overloading #1
    static int add(int a, int b) {
        return a + b;
    }

    // Method overloading #2
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Panggil method-method yang sudah di-overload
        System.out.println("penjumlahan dari nilai a dan b (integer): " + add(5, 7));
        System.out.println("penjumlahan dari nilai a dan b (double) : " + add(2.5, 3.5));
    }
}

