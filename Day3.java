package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {
    public static void main(String[] args) {
    
    //membuat variabel dan scanner
    int belanja=0;
    Scanner input = new Scanner (System.in);
    
    //mengambil input
    System.out.println("total belanjaan: Rp. ");
    belanja = input.nextInt();
        
    //pengecekan belanjaan
    if (belanja>200000){
    System.out.println("selamat anda mendapatkan hadiah");
    }
    else;
    System.out.println("terimakasih telah berbelanja ditoko kami");
    }
    
}
