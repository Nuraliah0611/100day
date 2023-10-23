
package day5;

import java.util.Scanner;
import java.util.Stack;

public class day15stack {
    public static void main(String[] args) {
        Scanner lia = new Scanner(System.in);
        System.out.println("masukkan string :");
        String Input = lia.nextLine();
        
        //stack
        Stack<Character> stack = new Stack<>();
        
        // masukkan karaktek string ke stack
        for (char c : Input.toCharArray()){
            stack.push(c);
        }
        //karakter dari stack ke string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        System.out.println("string terbaik :" + reversed.toString());
    }
}
