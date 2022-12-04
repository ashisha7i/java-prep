package com.pranshu.util;

public class Greeter {
    
    /**
     * Greets a user without a name
     */
    public void greet(){
        System.out.println("Hello user");
    }

    /**
     * Greets a user with their name
     * @param name
     */
    public void greet(String name){
        System.out.println("Hello user " + name);
    }
}

