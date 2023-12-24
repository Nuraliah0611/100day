
import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pilih jenis konversi: ");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celcius");
        
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        
        if (pilihan == 1){
            System.out.print("\nmasukkan suhu dalam Celcius: ");
            double suhuCelcius = sc.nextDouble();
            double suhuFahrenheit = (9.0 / 5.0 * suhuCelcius) + 32;
            System.out.println("Hasil konversi: " + suhuFahrenheit + " F");
        }else if (pilihan == 2){
            System.out.print("\nmasukkan suhu dalam Fahrenheit: ");
            double suhuFahrenheit = sc.nextDouble();
            double suhuCelcius = (5.0 / 9.0 ) * (suhuFahrenheit - 32);
            System.out.println("Hasil konversi: " + suhuCelcius + " C");
        }else{
            System.out.println("Pilihan tidak valid!");
        }
        sc.close();
    }
}
