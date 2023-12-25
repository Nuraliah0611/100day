
import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat positif: ");
        int bilangan = sc.nextInt();
        
        while(bilangan <= 0){
            System.out.println("Input tidak valid. Masukkan bilangan bulat positif");
            System.out.println("Masukkan bilangan bulat positif: ");
            bilangan = sc.nextInt();
        }
        
        boolean isPrima = cekPrima(bilangan);
        if(isPrima){
            System.out.println("\n" + bilangan + " adalah bilangan prima");
        }else {
            System.out.println("\n" + bilangan + " bukan bilangan prima");
        }
        sc.close();
    }
    private static boolean cekPrima(int bilangan){
        if (bilangan <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(bilangan);i++){
            if (bilangan % i == 0){
                return false;
            }
        }
        return true;
    }
}
