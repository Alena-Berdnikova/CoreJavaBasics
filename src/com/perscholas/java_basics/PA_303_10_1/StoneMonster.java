package com.perscholas.java_basics.PA_303_10_1;

public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    protected String attack() {
        return "Attack with stones!";
    }
}
