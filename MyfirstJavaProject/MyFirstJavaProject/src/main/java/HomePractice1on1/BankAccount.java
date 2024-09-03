package HomePractice1on1;
// method overloading

public class BankAccount {

    public void sighnIn(String myName, String accountNumber){
        System.out.println("new Bank Created" + accountNumber);
    }

    public void sighnIn( String name, int last4digitsOfSSN){
System.out.println("wow new login " + last4digitsOfSSN);
    }

    public void signIn ( String faceID , int accountNumber, int phoneNumber){
        System.out.println("Congratulations new sign in " + accountNumber + phoneNumber);
    }


    // method overRidding = between two classes not any classes -  should have the same relationship.
    // @override to call the super class









}


