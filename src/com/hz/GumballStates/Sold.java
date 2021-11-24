package com.hz.GumballStates;

import com.hz.GumballMachine;

public class Sold implements GumballStates {
    
    GumballMachine gumballMachine;

    public Sold(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        this.gumballMachine.removeGumball();
    }

    @Override
    public String toString() {
        return "delivering a gumball";
    }
}
