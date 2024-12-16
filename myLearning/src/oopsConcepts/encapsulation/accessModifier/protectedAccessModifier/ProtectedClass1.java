package oopsConcepts.encapsulation.accessModifier.protectedAccessModifier;

public class ProtectedClass1 extends ProtectedClass {
    @Override
    protected void getValue(){
        System.out.println("Sibtain");
    }
    public static void main(String[] args) {
        ProtectedClass pc= new ProtectedClass();
        pc.getValue();
    }

}
