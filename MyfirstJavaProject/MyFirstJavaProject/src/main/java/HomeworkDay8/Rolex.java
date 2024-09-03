package HomeworkDay8;

public class Rolex extends Watch{

    public String itemName;
    private int id;
    private int watchPrice;
    private String rating;
    private int unitsSold;
    private int totalSales;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setWatchPrice(int watchPrice){
        this.watchPrice = watchPrice;
    }

    public int getWatchPrice(){
        return watchPrice;
    }

    public void setRating(String rating) {
        this.rating = rating;

    }

    public String getRating(){
        return rating;
    }

    public void setUnitsSold(int unitsSold){
        this.unitsSold = unitsSold;

    }

    public int getUnitsSold(){
        return unitsSold;

    }

    public void setTotalSales(int totalSales){
        this.totalSales = totalSales;
    }

    public int getTotalSales(){

        return totalSales;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
        public int checkTotalSales() {
            totalSales = watchPrice * unitsSold;
            return totalSales;
    }

}
