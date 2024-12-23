package oopsConcepts.methods.overriding;

public class Calculator extends Sum{
    @Override
    public String doSum(String a) {
        return "";
    }

    @Override
    public int sum(int a){
        return a;
    }
    public static void main(String[] args) {
//        Sum mySum= new Sum();

//        System.out.println(mySum.doSum(4,5));
//        System.out.println(mySum.doSum("kala"));
//        System.out.println(mySum.doSum(1,3,-1));
    }
}
