package HomePractice1on1;

public class AirFry{

      public static void greeting(String name){
          System.out.println("Welcome to binary logic "+name.toUpperCase());
      }

    public static boolean allowedPlay(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

          greeting("Nahsang");


    }


}



