import java.util.Scanner;

public class MultiplyBy50 {
    public static int fixed=50;
    public static void main(String[] args) {
      Scanner number= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= number.nextInt();
        System.out.println("output is  "+ num*MultiplyBy50.fixed);

    }
}
