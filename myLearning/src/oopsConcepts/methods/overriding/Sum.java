package oopsConcepts.methods.overriding;

public abstract class Sum {

    public int doSum(int a, int b){
        return a+b;
    }
    public int doSum(int a, int b, int c){
        return a+b+c;
    }
    public abstract String doSum(String a);

    public abstract int sum(int a);
}
