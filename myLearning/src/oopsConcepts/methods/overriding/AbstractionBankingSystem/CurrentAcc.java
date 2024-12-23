package oopsConcepts.methods.overriding.AbstractionBankingSystem;

import oopsConcepts.methods.overriding.InterfaceVehicleManagement.DemoVehicle;
import oopsConcepts.methods.overriding.InterfaceVehicleManagement.Vehicle;

public class CurrentAcc extends BankDetails implements Vehicle, DemoVehicle {
    @Override
    public String CheckBalance(String name, String DOB, String uuid, String accNo, String accType) {
        name= "Preeti";
        DOB= "05-09-1998";
        uuid="9800989kojd02293";
        accNo= "98297jsoij929028";
        accType= "current";
        return "Balanced check for account number "+accNo+" of account type "+ accType +" ";
    }

    @Override
    public String startEngine(String engineType) {
        return "";
    }

    @Override
    public void demoType() {
        
    }
}
