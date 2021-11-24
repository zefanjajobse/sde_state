package com.hz.GumballStates;

import com.hz.GumballMachine;

public class HasNoQuarter implements GumballStates {

    GumballMachine gumballMachine;

    public HasNoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        this.gumballMachine.setState(new HasQuarter(this.gumballMachine));
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }
    
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
