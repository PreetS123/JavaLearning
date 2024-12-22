package collectionFramework.leaningQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(0);
        queue.offer(4);
        queue.offer(9);
        queue.offer(1);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
