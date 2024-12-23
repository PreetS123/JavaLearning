package oopsConcepts.methods.overriding;

public class AndroidCalculator extends Sum {
    @Override
    public String doSum(String a) {
        return "Calculator android";
    }

    @Override
    public int sum(int a) {
        return 0;
    }

}
