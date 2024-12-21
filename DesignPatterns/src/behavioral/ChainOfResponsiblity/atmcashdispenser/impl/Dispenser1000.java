package behavioral.ChainOfResponsiblity.atmcashdispenser.impl;

import behavioral.ChainOfResponsiblity.atmcashdispenser.CashDispenser;

public class Dispenser1000 implements CashDispenser {
    @Override
    public void dispenseCash(int amount) {
        int pendingAmount = 0;
        int noOfNotes =0;
        if(amount<1000){
            pendingAmount =amount;
        }
        else{
            pendingAmount = amount%1000;
            noOfNotes = amount/1000;
        }
        System.out.println("DISPENSING" + noOfNotes+" 1000 NOTES for");
        if(pendingAmount !=0){
            Dispenser500 dispenser500 = new Dispenser500();
            dispenser500.dispenseCash(pendingAmount);
        }

    }
}
