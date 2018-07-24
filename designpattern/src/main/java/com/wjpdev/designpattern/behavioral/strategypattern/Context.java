package com.wjpdev.designpattern.behavioral.strategypattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}