package oopsConcepts.methods.overloading;

public class Bank {
    public static void main(String[] args) {
        System.out.println("I'm main");


    }
    public void processSalary(){
        System.out.println("Process salary with zero parameter");
    }
    public void processSalary(String salary){
        System.out.println("Process salary with one parameter "+salary);
    }
    public void processSalary(int a){
        System.out.println("Process salary with one parameter "+a);
    }

}
