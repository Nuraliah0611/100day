
package day5;

import java.util.Stack;

public class day18StackTest02 {
    public static void main(String[] args) {
        Stack lia = new Stack();
        lia.push(234760);
        System.out.println(lia);
        
        lia.push(23);
        lia.push(27);
        lia.push(24);
        lia.push(46);
        lia.push(30);
        lia.push(6);
        System.out.println(lia);
 
        System.out.println("POP :"+lia.pop());
        
        System.out.println("PEEK :"+lia.peek());
        
        lia.push(2723);
        lia.push(244306);
        System.out.println(lia);
        
        System.out.println("isEmpty: "+lia.isEmpty());
    }
}
