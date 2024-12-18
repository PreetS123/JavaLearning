package mainLectures.ExceptionHandling;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        System.out.println("Before starting");
        try{
            myFun();
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
        System.out.println("After starting");
    }
    public static void myFun(){
        System.out.println("1");
        try {
            int size = 5;
            int arr[] = new int[size];
            arr[13] = 13;
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("2");
    }
}
