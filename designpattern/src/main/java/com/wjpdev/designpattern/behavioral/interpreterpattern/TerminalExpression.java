package com.wjpdev.designpattern.behavioral.interpreterpattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
