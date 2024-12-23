package oopsConcepts.methods.overriding.InterfaceVehicleManagement;

public class Car implements Vehicle{

    @Override
    public String startEngine(String engineType) {
        engineType="CarEngine";
        return engineType;
    }
}
