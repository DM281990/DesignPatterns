package behavioral.state.impl;

import behavioral.state.Coin;
import behavioral.state.Item;
import behavioral.state.State;
import behavioral.state.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {
    public IdleState(){
        System.out.println("Currently vending machine is in Idle State");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently vending machine is in Idle State");
        machine.setCoinList(new ArrayList<>());
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("First you need to click on Insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in Idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot choose product in Idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You cannot get change in Idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot dispese product in Idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cannot get return in Idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception{
        vendingMachine.getInventory().addItem(item,codeNumber);
    }
}
