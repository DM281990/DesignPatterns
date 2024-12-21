package structural.decorator.icecream.decorator.impl;

import structural.decorator.icecream.IceCream;

public class MangoJellyDecorator extends IceCream{
    IceCream iceCream;
    public MangoJellyDecorator(IceCream iceCream) {
        super(iceCream);
        this.iceCream = iceCream;
    }

    public String description() {
        return this.iceCream.description()+"with Mango Decorator";
    }

    public int getPrice() {
        return this.iceCream.getPrice()+15;
    }
}
