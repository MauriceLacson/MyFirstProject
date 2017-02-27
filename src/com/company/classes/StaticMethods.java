package com.company.classes;

/**
 * Created by nxtlvl on 2/20/2017.
 */
public class StaticMethods {

    public static int myMethod(int num){
        int sum=0;
        for(int numone=1;numone<=num;numone++){
             sum += numone;
        }
        return sum ;

    }
}
