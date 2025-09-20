package collections;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class pro {

    public static void main(String[] args) {
        /*
        * Thread Safe Version of Priority Queue: PriorityBlockingQueue
        *
        * Thread Safe Version of Array Dequeu: ConcurrentLinkedQueue
        *
        *
        * */

        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.offer(1);
        queue.offer(2);

        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        concurrentLinkedDeque.offer(1);
        concurrentLinkedDeque.offer(2);


    }
}
