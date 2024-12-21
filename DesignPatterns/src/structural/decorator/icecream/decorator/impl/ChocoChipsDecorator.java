package structural.decorator.icecream.decorator.impl;

import structural.decorator.icecream.IceCream;

public class ChocoChipsDecorator extends IceCream {
    IceCream iceCream;
    public ChocoChipsDecorator(IceCream iceCream) {
        super(iceCream);
        this.iceCream = iceCream;
    }

    public String description() {
        return this.iceCream.description()+"with Choco Chip Decorator";
    }

    public int getPrice() {
        return this.iceCream.getPrice()+5;
    }
}
