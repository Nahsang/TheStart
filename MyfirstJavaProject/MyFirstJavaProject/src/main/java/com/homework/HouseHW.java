package com.homework;

public class HouseHW {
    public static void main(String[] args) {

       HouseHW2 mansion = new HouseHW2();
        HouseHW2 bronStone = new HouseHW2();
        HouseHW2 familyStyle = new HouseHW2();
       familyStyle.houseType = " 3br kingdom";
       familyStyle.price = 300000;
       familyStyle.howManySqft = 3499320;
       familyStyle.location = "japan";
       familyStyle.roofType = "brownStripes";
       mansion.price = 3000;
       mansion.roofType = "brown brick";
       mansion.location = "greece";
       bronStone.location = "california";




System.out.println(mansion.location);
familyStyle.sold();

    }
}
