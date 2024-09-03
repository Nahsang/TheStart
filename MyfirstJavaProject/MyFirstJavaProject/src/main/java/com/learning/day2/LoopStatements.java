package com.learning.day2;

public class LoopStatements {
    public static void main(String[] args) {

        for(int i=5; i>0; i--){
            for ( int k=i; k<5; k++){
                System.out.print("*");
            }
            System.out.println();
        }



        for(int i=0; i>5; i++){
            for ( int k=0; k<i+1; k++){
                System.out.print("*");
            }
            System.out.println();



        }

    }
}