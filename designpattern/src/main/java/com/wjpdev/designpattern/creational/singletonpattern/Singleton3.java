package com.wjpdev.designpattern.creational.singletonpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Singleton3 {
    private volatile static Singleton3 singleton;
    private Singleton3(){}
    public static Singleton3 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
