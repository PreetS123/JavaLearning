package oopsConcepts.methods.overriding.AbstractionBankingSystem;

public class SavingAcc extends BankDetails{
    @Override
    public String CheckBalance(String name, String DOB, String uuid, String accNo, String accType) {
        name= "Preeti";
        DOB= "05-09-1998";
        uuid="980098902293";
        accNo= "98297929028";
        accType= "saving";
        return "Balanced check for account number "+accNo+" of account type "+ accType +" ";
    }

}
