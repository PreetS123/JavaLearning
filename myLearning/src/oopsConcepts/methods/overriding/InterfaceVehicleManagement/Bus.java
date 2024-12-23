package oopsConcepts.methods.overriding.InterfaceVehicleManagement;

public class Bus implements Vehicle, DemoVehicle{
    @Override
    public String startEngine(String engineType) {
        engineType= "BusEngine";

        return engineType;
    }

    @Override
    public void demoType() {

    }
}
