package com.iesemilidarder.project.base.data;

public abstract class Vehicle {
    public abstract void start();

    public void brake (){
        log("he frenado");
    }

    /**
     *
     * @param message
     */

    public void log(String message){
        System.out.println(message);
    }
}

