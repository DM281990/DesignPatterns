package structural.decorator;

import structural.decorator.icecream.IceCream;
import structural.decorator.icecream.decorator.impl.ChocoChipsDecorator;
import structural.decorator.icecream.decorator.impl.MangoJellyDecorator;
import structural.decorator.icecream.decorator.impl.StrawBerryJellyDecorator;
import structural.decorator.icecream.impl.ButterScotchIceCream;
import structural.decorator.icecream.impl.VanillaIceCream;

public class ZSolution {
    public static void main(String[] args) {
        IceCream iceCream = new StrawBerryJellyDecorator(new MangoJellyDecorator(new ChocoChipsDecorator(new ButterScotchIceCream())));
        System.out.println(iceCream.description());
        System.out.println(iceCream.getPrice());
        IceCream iceCream1 = new StrawBerryJellyDecorator(new MangoJellyDecorator(new VanillaIceCream()));
        System.out.println(iceCream1.description());
        System.out.println(iceCream1.getPrice());

    }
}
