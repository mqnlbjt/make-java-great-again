package ch3.Test;

import ch3.PriorityQueue;
import org.junit.Test;

public class PriorityQueueTest {
    @Test
    public void test(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(6);
        priorityQueue.add(7);
        priorityQueue.add(8);

        Integer peek = priorityQueue.peek();
        System.out.println(peek);
    }
}
