package com.company;

public class Box<T>{
    private T value;

    public static  <T> Box<T> genericMethod() {
        return new Box<>();
    }

}
