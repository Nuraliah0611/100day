
import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah detik: ");
        int detik = sc.nextInt();
        
        int jam = detik / 3600;
        int sisaDetik = detik % 3600;
        int menit = sisaDetik / 60;
        int detikSisa = sisaDetik % 60;
        
        System.out.println("\nWaktu setara: " + jam + "jam " + menit + " menit " + detikSisa + " detik");
    }
}
