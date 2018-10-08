package com.iesemilidarder.project.base.data;

public abstract class Vehicle {
    public abstract void start();

    public void brake (){
<<<<<<< HEAD
        doLog("he frenado");
=======
        log("he frenado");
>>>>>>> f81ed53d1e68c5acf0b84d9f198800c9b7fbbee9
    }

    /**
     *
     * @param message
     */

<<<<<<< HEAD
    protected void doLog(String message){
        System.out.println(message);
    }

    private String showLog(String message){
        doLog(message);
        return message;
=======
    public void log(String message){
        System.out.println(message);
>>>>>>> f81ed53d1e68c5acf0b84d9f198800c9b7fbbee9
    }
}

