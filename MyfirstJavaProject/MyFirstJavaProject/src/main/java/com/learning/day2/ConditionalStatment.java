package com.learning.day2;

public class ConditionalStatment {
    public static void main(String[] args) {

        // conditional statement :
        // if
        // else
        // else if
        // switch

        boolean condition = false;

        if (condition) {
            System.out.println("this block of code will print if condition is true ");
        } else {
            System.out.println(" this block of code will print if condition is false");
        }

        // write a logic to check given person is a senior citizen or not
        // person age is grater then 50 => senior citizen

        int age = 25;

        if (age > 50) {
            System.out.println(" this is senior citizen");
        } else {
            System.out.println(" this is not senior citizen");
        }

        int personAge = 35;

        if (personAge > 50) {
            System.out.println(" this is a senior citizen");
        } else if (personAge >= 20 && personAge < 50) {
            System.out.println(" this is younger ");

        } else if (personAge < 20) {
            System.out.println(" this is a teenager");
        }


        // switch
        //  switch( exprssion){
        //     case 1:

        //     break;
        //  case 2:

        //  break;
        //default
        //   code
        /// break;

        String trafficlight = "red";
        switch (trafficlight) {
            case "red":
                System.out.println("stop");
                break;
            case "green":
                System.out.println(" go fast");

            case " yellow ":
                System.out.println(" slow down");
                break;

            default:
                System.out.println("invaild input");
        }


        String language = "...";

        if (language == "french") {
            System.out.println("bon jour");


        }
    }
}
