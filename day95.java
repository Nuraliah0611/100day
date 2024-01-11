public class day95 {
    public static void main(String[] args) {
        int batasAtas = 100;
        int jumlahPrima = hitungJumlahPrima(batasAtas);
        
        System.out.println("Jumlah bilangan prima antara 1 dan " + batasAtas + " adalah: " + jumlahPrima);
    }

    public static int hitungJumlahPrima(int n) {
        int jumlahPrima = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                jumlahPrima++;
            }
        }

        return jumlahPrima;
    }

    public static boolean isPrima(int angka) {
        for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}