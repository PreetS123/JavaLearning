package preClassLecture.week2.day_9;

public class ExceptionClass {
    public static void main(String[] args) {
        System.out.println("Programe got started.....");

        try{
            int x=10;
            int y=0;
            int z=x/y;  // here arthimatic exception will occur
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("catch :: "+ e.getMessage()); // handling error is important
        }



        System.out.println("Programe got started.....");
    }
}
