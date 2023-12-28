
import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan sebuah kata: ");
        String kata = sc.nextLine();
        
        String kataTanpaSpasi = kata.replaceAll("\\s", "").toLowerCase();
        
        boolean isPalindrom = cekPolindrom(kataTanpaSpasi);
        
        if(isPalindrom){
            System.out.println("\n" + kata + " adalah kata Polindrom");
        }else{
            System.out.println("\n" + kata + " bukan kata Polindrom");
        }
        sc.close();
    }
    private static boolean cekPolindrom(String kata){
        int panjang = kata.length();
        for (int i = 0; i < panjang/2 ; i++) {
            if(kata.charAt(i) != kata.charAt(panjang - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
