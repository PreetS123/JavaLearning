package oopsConcepts.methods.overriding.AbstractionBankingSystem;

public abstract class BankDetails {

    String name;
    String DOB;
    String uuid;
    String accNo;
    String accType;

    public abstract String CheckBalance(String name, String DOB, String uuid, String accNo, String accType);



}
