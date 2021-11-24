package com.hz.GumballStates;

public interface GumballStates {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    String toString(); // returns the state
}
