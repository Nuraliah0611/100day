
package day5;

public class day23fibonanci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Bilangan Fibonacci hingga ke-" + n + " adalah:");

        int[] NomorFibonacci= new int[n];
        NomorFibonacci[0] = 0;
        NomorFibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            NomorFibonacci[i] = NomorFibonacci[i - 1] + NomorFibonacci[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(NomorFibonacci[i] + " ");
        }
    }
}
