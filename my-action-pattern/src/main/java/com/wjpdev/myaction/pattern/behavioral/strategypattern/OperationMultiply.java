package com.wjpdev.myaction.pattern.behavioral.strategypattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
