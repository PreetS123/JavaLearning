package Collection;

import java.util.List;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> str= new Stack<>();
        str.push("Cat");
        str.push("Dog");
        str.push("Horse");
        str.push("Lion");
        str.push("Monkey");
        System.out.println(str);
        System.out.println(str.peek());
        str.pop();
        System.out.println(str);
    }
}
