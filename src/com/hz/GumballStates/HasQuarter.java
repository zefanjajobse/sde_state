package com.hz.GumballStates;

import com.hz.GumballMachine;

public class HasQuarter implements GumballStates {

    GumballMachine gumballMachine;

    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");   
        this.gumballMachine.setState(new HasNoQuarter(this.gumballMachine));
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        this.gumballMachine.setState(new Sold(this.gumballMachine));
        this.gumballMachine.dispense(); 
    }
    
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
