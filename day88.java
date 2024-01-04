
import java.util.Scanner;

public class day88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat: ");
        int bulat = sc.nextInt();
        
        String biner = konversiDesimalBiner(bulat);
        
        System.out.println("Bilangan biner: " + biner);
        
        sc.close();
    }
    private static String konversiDesimalBiner(int bulat){
        return Integer.toBinaryString(bulat);
    }
}
