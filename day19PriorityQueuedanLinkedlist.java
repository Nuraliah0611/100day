
package day5;

import java.util.LinkedList;
import java.util.Queue;

public class day19PriorityQueuedanLinkedlist {
    public static void main(String[] args) {
       Queue<Double>lia = new LinkedList<>();
        
        System.out.println(lia);
        
        lia.offer(12.34);
        lia.offer(23.27);
        lia.offer(30.424);
        System.out.println(lia);
        
        System.out.println("poll :"+lia.poll());
        
        System.out.println("peek :"+lia.peek());
        
        lia.offer(611.22);
        System.out.println(lia);
    }
}
