package com.iesemilidarder.project.base.data;

public class Submarine extends WaterCraft implements IDive {
    public void goDeeper() {

    }

    public void goSurface() {

    }

    public void doFloat() {
        super.doFloat();
        System.out.println("Floto, pero tambien me piro!");
    }
}
