package HomePractice1on1;

public class BankTransaction {

    public String userName;
    private String password;

    private double checkingAccountBalance = 500.000;
    private double savingsAccountBalance = 200.000;


  // method overloading


    public void login(String userName , String password){
        System.out.println("Now logged into bank app"+ userName);// logic
    }


    public void login(int birthDate , String password){
        System.out.println("Now logged into bank app" + birthDate);
    }

    public void login(String kidsName , int ssn){
        System.out.println("Now logged into bank app"+ ssn );
    }


    public void trasferFromCheckingToSavings(double transferAmount){
        checkingAccountBalance = checkingAccountBalance - transferAmount;
        savingsAccountBalance = savingsAccountBalance+ transferAmount;
    }

    public void trasferFromSavingsToCheckings(double transferAmount){
        checkingAccountBalance = checkingAccountBalance + transferAmount;
        savingsAccountBalance = savingsAccountBalance- transferAmount;
    }






}
