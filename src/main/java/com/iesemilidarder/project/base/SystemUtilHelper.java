package com.iesemilidarder.project.base;

public class SystemUtilHelper {

    private SystemUtilHelper () {
        //Todo: Os generalization
    }

    public static void consolePrint(String message) {
        System.out.println(message);
    }

    public static void  logError (Exception e) {
        consolePrint("ERROR:"+ e);
    }
}
