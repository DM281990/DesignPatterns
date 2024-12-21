package structural.decorator.icecream.decorator;

import structural.decorator.icecream.IceCream;

public  class IceCreamDecorator extends IceCream{
    IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        super(iceCream);
        this.iceCream = iceCream;
    }

    public String description() {
        return this.iceCream.description()+"with IceCream Decorator";
    }

    public int getPrice() {
        return this.iceCream.getPrice()+20;
    }
}
