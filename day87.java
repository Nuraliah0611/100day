
import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan suku ke - n: ");
        int n = sc.nextInt();
        
        while (n <= 0){
            System.out.println("Input tidak valid. Masukkan suku ke-n yang lebih dari 0");
            System.out.println("Masukkan suku ke - n: ");
            n = sc.nextInt();
        }
        System.out.println("Deret fibonanci hingga suku ke -" + n + ".");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonanci(i)+"");
        }
        sc.close();
    }
    private static int fibonanci(int n){
        if (n == 0) {
            return 0;
        }else if( n == 1){
            return 1;
        }else{
            return fibonanci(n - 1) + fibonanci(n-2);
        }
    }
}
