package com.learning.day2;
public class typecasting {
    public static void main( String[] args){

// widening casting

        byte a = 120;
        System.out.println(a);
        int b = a;
        System.out.println(b);

        // narrowing casting

        int number = 100;

        byte byteValue = (byte)number;
        short shortValue = (short)number;
// narrowing
        float floatValue = 12.345f;

        int inValue = (int) floatValue;

        System.out.println(inValue);
// manuel
        short shortValue2 = 4523;

        double doubleValue = shortValue2;

        System.out.println(doubleValue);


    }
}
