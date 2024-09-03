package com.GroupProject;
import java.io.*;

public class App {
    public static void main( String[] args ) throws IOException {

          User user = new User();

          user.name = "nana";
          user.password="iloveu";

          user.sayHello();
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! :) ");


    }
}
