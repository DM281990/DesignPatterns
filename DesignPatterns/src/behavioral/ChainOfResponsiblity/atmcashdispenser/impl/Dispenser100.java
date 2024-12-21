package behavioral.ChainOfResponsiblity.atmcashdispenser.impl;

import behavioral.ChainOfResponsiblity.atmcashdispenser.CashDispenser;

public class Dispenser100 implements CashDispenser {
    @Override
    public void dispenseCash(int amount) {
        public void dispenseCash(int amount) {
            int noOfNotes =0;
            noOfNotes = amount/100;
            System.out.println("DISPENSING" + noOfNotes+" 100 NOTES for");
        }
    }
}
