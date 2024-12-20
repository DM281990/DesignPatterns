package structural.factory;

import structural.factory.impl.IPhone;
import structural.factory.impl.RealMe;
import structural.factory.impl.Samsung;

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
