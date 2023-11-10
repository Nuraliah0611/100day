
package day33programdariflowchart;

import java.util.Scanner;

public class Day33programDariFlowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai x :");
        int x = sc.nextInt();
        System.out.println("masukkan nilai y :");
        int y = sc.nextInt();
        
        int p = x + y;
        System.out.println("nilai p :" + p);
        int q = x * y;
        System.out.println("nilai q :" + q);
        if (p >=4){
            
            q = x + y;
        
        }else{
            q = x/y;
            
            System.out.println("nilai q :" +q);
                   
        }
        
    }
}
