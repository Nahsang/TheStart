package HomeworkDay8;

public class Main {
    public static void main(String[] args) {
//   Product   -> id, name , price, rating
        Rolex watch1 = new Rolex();
        watch1.setId(9111998);
        watch1.setRating("5.0");
        watch1.setItemName("Rolex Yacht Master");
        watch1.setWatchPrice(30000);
        watch1.setUnitsSold(200);


        System.out.println(watch1.checkTotalSales());

    }
}
