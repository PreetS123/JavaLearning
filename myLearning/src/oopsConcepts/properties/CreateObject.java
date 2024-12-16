package oopsConcepts.properties;

public class CreateObject {
    public static void main(String[] args) {
        CallObject callObj= new CallObject();
        callObj.abc();
        CallObject.staticMethod();
    }
}
