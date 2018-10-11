package com.iesemilidarder.project.base;

import com.iesemilidarder.project.base.data.Moto;
import com.iesemilidarder.project.base.data.SystemUtilHelper;
import com.iesemilidarder.project.base.data.Vehicle;

public class Launcher {
    public static void main (String... args)    {
        System.out.println("Concesionario brumbrum App 2.0");
        Moto moto = new Moto();
        moto.setNumWheels(2);
        moto.setPrice(123.45);
        moto.setColor("Blanco");
        System.out.println("Ruedas:"+moto.getNumWheels());
        moto.start();
        System.out.println("pista que voy!");
        moto.brake();
        Vehicle aux = new Moto();
        SystemUtilHelper.consolePrint("yuhu");
    }
}
