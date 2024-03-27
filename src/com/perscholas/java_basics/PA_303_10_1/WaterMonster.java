package com.perscholas.java_basics.PA_303_10_1;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    protected String attack() {
        return "Attack with water!";
    }
}
