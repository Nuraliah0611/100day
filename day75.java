
import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan tahun: ");
        int tahun = sc.nextInt();
        
        if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
            System.out.println("\n" + tahun + " adalah tahun kabisat ");
        }else{
            System.out.println("\n" + tahun + " bukan tahun kabisat ");
        }
        sc.close();
    }
}
