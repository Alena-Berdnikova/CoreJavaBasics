package com.perscholas.java_basics.PA_303_10_1;

public class FireMonster extends Monster{
    public FireMonster(String name) {
        super(name);
    }

    @Override
    protected String attack() {
        return "Attack with fire!";
    }
}
