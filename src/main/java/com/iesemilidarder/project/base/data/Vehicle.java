package com.iesemilidarder.project.base.data;

public abstract class Vehicle {
    public abstract void start();

    public void brake (){
        doLog("he frenado");
    }

    /**
     *
     * @param message
     */

    protected void doLog(String message){
        System.out.println(message);
    }

    private String showLog(String message){
        doLog(message);
        return message;
    }
}

