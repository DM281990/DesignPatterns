package behavioral.state;

import behavioral.state.impl.HasMoneyState;
import behavioral.state.impl.IdleState;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory =new Inventory(10);
        coinList = new ArrayList<>();
    }
    public void setCoinList(ArrayList<Coin> objects) {
        this.coinList =objects;
    }

    public void setVendingMachineState(State state) {
      this.vendingMachineState = state;
    }

    public Inventory getInventory() {
        return this.inventory;
    }


    public List<Coin> getCoinList() {
        return this.coinList;
    }
}
