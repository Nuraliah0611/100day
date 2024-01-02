
import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kata atau kalimat: ");
        String input = sc.nextLine();
        
        int jumlahVokal = hitungHurufVokal(input);
        
        System.out.println("\njumlah huruf vokal: " + jumlahVokal);
        
        sc.close();
    }
    private static int hitungHurufVokal(String kata){
        int jumlah = 0;
        for (int i = 0; i < kata.length(); i++) {
            char huruf = Character.toLowerCase(kata.charAt(i));
                    if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
                        jumlah++;
                    }
        }
        return jumlah;
    }
}
