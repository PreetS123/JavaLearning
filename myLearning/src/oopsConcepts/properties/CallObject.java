package oopsConcepts.properties;

public class CallObject {
   static int num=10;
    public static void main(String[] args) {
//        CallObject.abc();
       CallObject ABC= new CallObject();
       ABC.abc();
       System.out.println(num);
    }
    public void abc(){
      System.out.println("I'm abc");
    }

    public static void staticMethod(){
        System.out.println("I'm a static method.");
    }
}
