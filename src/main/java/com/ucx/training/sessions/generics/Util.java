package com.ucx.training.sessions.generics;

public class Util {
    //Don't initialize this
    private Util(){

    }

    public static <T extends Number> boolean isEven(T t){
        return (t.intValue() % 2 == 0);
    }
}
