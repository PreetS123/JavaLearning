package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<String> str= new LinkedList<>();
        str.add("Cat");
        str.add("Dog");
        str.add("Horse");
        str.add("Lion");
        str.add("Monkey");
        System.out.println(str);
        str.poll();
        System.out.println(str);
    }
}
