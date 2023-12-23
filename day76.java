
import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat positif: ");
        int bilangan = sc.nextInt();
        
        while(bilangan <= 0){
            System.out.println("Input tidak valid, masukkan bilangan bulat posiitf");
            System.out.println("Masukkan bilangan bulat positif");
            bilangan = sc.nextInt();
        }
        int jumlahDigit = hitungJumlahDigit(bilangan);
        
        System.out.println("\nJumlah digit " + jumlahDigit);
        sc.close();
    }
    private static int hitungJumlahDigit(int bilangan) {
        String bilanganString = Integer.toString(bilangan);
        return bilanganString.length();
    }
}
