package behavioral.state.impl;

import behavioral.state.inventory.Coin;
import behavioral.state.inventory.Item;
import behavioral.state.State;
import behavioral.state.inventory.VendingMachine;

import java.util.List;

public class SelecionState implements State {
    public SelecionState(){
        System.out.println("Currently vending machine is in Selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot insert coin in selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory().geItem(codeNumber);
        int paidByUser = 0;
        for(Coin coin:machine.getCoinList()){
            paidByUser+=coin.value;
        }
        if(paidByUser<item.getPrice()){
            System.out.println("INSUFFICIENT AMOUNT");
            refundFullMoney(machine);
            throw new Exception("Insufficient fund");
        }
        else{
            getChange(paidByUser-item.getPrice());
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned full money in coin dispense tray");
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product cannot be dispensed in selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned full amount back in coin dispense tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int countNumber) throws Exception{
        throw new Exception("Inventory cant be updated in Selection State");
    }
}
