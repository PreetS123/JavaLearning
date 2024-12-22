package collectionFramework.leaningQueue;

import java.util.ArrayDeque;

public class LearnArrayDeck {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq= new ArrayDeque<>();
        adq.offer(9);
        adq.addFirst(-4);
        adq.add(2);
        adq.addLast(1);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq);
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
//        adq.pop();
        System.out.println(adq);
    }
}
