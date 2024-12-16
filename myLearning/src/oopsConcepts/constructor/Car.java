package oopsConcepts.constructor;

public class Car {
    final String stearing="1 stearing";
    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car(3);
        Car maruti= new Car("4 wheels","steel body", "2 stearing");
    }

    private Car(){
       System.out.println("I'm a car constructor");
    }


    public Car(int a){
        System.out.println(a);
    }
    public Car(String wheels,String body, String stearing){
       super();
       stearing= this.stearing;
        System.out.println(wheels);
        System.out.println(body);
        System.out.println(stearing);

    }
}
