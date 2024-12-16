package oopsConcepts;

public class FirstClass {

    public static void main(String[] args) {
        String normal="sjhjks";
        for(int i=0; i<normal.length(); i++){
            System.out.println(normal.charAt(i));
        }

        String[] arr = {"ab","b","c"};

        for(String a : arr){
            System.out.println(a);
        }

    }

}
