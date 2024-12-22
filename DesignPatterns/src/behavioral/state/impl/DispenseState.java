package behavioral.state.impl;

import behavioral.state.inventory.Coin;
import behavioral.state.inventory.Item;
import behavioral.state.State;
import behavioral.state.inventory.VendingMachine;

import java.util.List;

public class DispenseState implements State {
    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently vending machine is in dispense state");
        dispenseProduct(machine,codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Inset coin button can not be clicked in dispense state ");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Product selection can not be clicked in dispense state ");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Inset coin  not possible in dispense state ");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product choose  not possible in dispense state ");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("refund  not possible in dispense state ");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldCount(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("refund  not possible in dispense state ");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int countNumber) throws Exception {
        throw new Exception("Inventory update not possible in dispense state");
    }
}
