package collectionFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animal= new Stack<>();

        animal.push("dog");
        animal.push("cat");
        animal.push("monkey");
        animal.push("horse");
        animal.push("cow");
        animal.push("buffalo");
        animal.push("lion");
        System.out.println(animal);
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal.peek());

        System.out.println(animal);
    }
}
