package com.hz;

import com.hz.GumballStates.GumballStates;
import com.hz.GumballStates.HasNoQuarter;
import com.hz.GumballStates.SoldOut;

public class GumballMachine {

    GumballStates state = new SoldOut(this);
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = new HasNoQuarter(this);
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = new HasNoQuarter(this);
    }

    public void removeGumball() {
        count = count - 1;
        if (count == 0) {
            System.out.println("Oops, out of gumballs!");
            state = new SoldOut(this);
        } else {
            state = new HasNoQuarter(this);
        }
    }

    public void setState(GumballStates gumballStates) {
        this.state = gumballStates;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        result.append(state);
        result.append("\n");
        return result.toString();
    }
}
