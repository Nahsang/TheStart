package com.homework;

public class LaptopHW {
    public LaptopHW() {
    }

    public static void main(String[] args) {

        LaptopHW2 mackbookPro = new LaptopHW2();

        mackbookPro.screenSize = "extralarge";
        mackbookPro.OS = "new model";
        mackbookPro.ram = 30;
        mackbookPro.price = 2300;
        mackbookPro.rating = 30;



        System.out.println(mackbookPro.screenSize);
        mackbookPro.waveSelect();
        mackbookPro.openApp();





    }
}
