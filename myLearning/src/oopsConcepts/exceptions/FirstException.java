package oopsConcepts.exceptions;

public class FirstException {
    public static void main(String[] args) {

      try{
          int a=-4;
          int b= 0;
          int c= a/b;
      }catch (Exception ae){
          System.out.println(ae.getMessage());
          throw ae;
      }

    }


}
