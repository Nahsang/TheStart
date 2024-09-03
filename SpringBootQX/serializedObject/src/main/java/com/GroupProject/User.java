package com.GroupProject;

import java.io.Serializable;

public class User implements Serializable {

    String name;
    String password;


    public void sayHello(){
        System.out.println("hello " + name);
    }


}
