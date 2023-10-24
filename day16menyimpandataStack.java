
package day5;

import java.util.Stack;

public class day16menyimpandataStack {
    public static void main(String[] args) {
        Stack<Double> myStack = new Stack<>();
        myStack.push(23.7);
        System.out.println(myStack);
        
        myStack.push(27.7);
        myStack.push(6.11);
        myStack.push(24.10);
        myStack.push(4.616);
        System.out.println(myStack);
        
        double value = myStack.pop();
        System.out.println("POP :"+ value);
        System.out.println(myStack);
        
        value = myStack.peek();
        System.out.println("PEEK :" + value);
        System.out.println(myStack);
        
        myStack.push(237.644);
        myStack.push(30.12);
        System.out.println(myStack);
        
    }
}
