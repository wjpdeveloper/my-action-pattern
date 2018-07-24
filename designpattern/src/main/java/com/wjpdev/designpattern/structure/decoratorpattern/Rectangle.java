package com.wjpdev.designpattern.structure.decoratorpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}