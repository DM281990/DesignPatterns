package behavioral.ChainOfResponsiblity.atmcashdispenser.impl;

import behavioral.ChainOfResponsiblity.atmcashdispenser.CashDispenser;

public class Dispenser2000 implements CashDispenser {
    @Override
    public void dispenseCash(int amount) {
        int pendingAmount = 0;
        int noOfNotes =0;
        if(amount<2000){
            pendingAmount =amount;
        }
        else{
            pendingAmount = amount%2000;
            noOfNotes = amount/2000;
        }
        System.out.println("DISPENSING" + noOfNotes+" 2000 NOTES for");
        if(pendingAmount !=0){
            Dispenser1000 dispenser1000 = new Dispenser1000();
            dispenser1000.dispenseCash(pendingAmount);
        }

    }
}
