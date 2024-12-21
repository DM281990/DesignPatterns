package creational.factory;

import creational.factory.impl.IPhone;
import creational.factory.impl.RealMe;
import creational.factory.impl.Samsung;

public class MobileFactory {
    public static Mobile getMobile(String data){
        return switch (data) {
            case "SAMSUNG" -> new Samsung();
            case "IPHONE" -> new IPhone();
            case "REALME" -> new RealMe();
            default -> null;
        };
    }
}
