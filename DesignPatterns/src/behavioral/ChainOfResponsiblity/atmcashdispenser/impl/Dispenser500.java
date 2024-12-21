package behavioral.ChainOfResponsiblity.atmcashdispenser.impl;

import behavioral.ChainOfResponsiblity.atmcashdispenser.CashDispenser;

public class Dispenser500 implements CashDispenser {
    @Override
    public void dispenseCash(int amount) {
        int pendingAmount = 0;
        int noOfNotes =0;
        if(amount<500){
            pendingAmount =amount;
        }
        else{
            pendingAmount = amount%500;
            noOfNotes = amount/500;
        }
        System.out.println("DISPENSING" + noOfNotes+" 500 NOTES for");
        if(pendingAmount !=0){
            Dispenser100 dispenser100 = new Dispenser100();
            dispenser100.dispenseCash(pendingAmount);
        }

    }
}
