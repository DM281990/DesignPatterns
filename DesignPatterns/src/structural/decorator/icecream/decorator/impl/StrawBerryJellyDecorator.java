package structural.decorator.icecream.decorator.impl;

import structural.decorator.icecream.IceCream;

public class StrawBerryJellyDecorator extends IceCream{
    IceCream iceCream;
    public StrawBerryJellyDecorator(IceCream iceCream) {
        super(iceCream);
        this.iceCream = iceCream;
    }

    public String description() {
        return this.iceCream.description()+"with StrawBerry Decorator";
    }

    public int getPrice() {
        return this.iceCream.getPrice()+10;
    }
}
