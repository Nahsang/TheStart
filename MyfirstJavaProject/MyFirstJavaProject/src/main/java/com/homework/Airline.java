package com.homework;

public class Airline {

    public String passengerName;
    private int seatNumber;
    private int TicketNumber;


// create a methods to take input to change Attribute values




    public void setpassengerName(String name){
     passengerName = name;
    }

    // create a methods to access attribute values.

    public String getPassengerName(){
        return passengerName;

    }

    public void setSeatNumber(){
        seatNumber = 30;
    }
    public int getSeatNumber(){
        return seatNumber;
    }

    public void setTicketNumber(){
        TicketNumber = 738202;
    }
    public  int getTicketNumber (){
        return TicketNumber;
    }
}

