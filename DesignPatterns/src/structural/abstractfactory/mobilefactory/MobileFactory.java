package structural.abstractfactory.mobilefactory;

import structural.abstractfactory.AbstractElectronicFactory;
import structural.abstractfactory.mobilefactory.impl.Iphone;
import structural.abstractfactory.mobilefactory.impl.RealMe;

import java.util.Map;

public abstract class MobileFactory {
    public static Mobiles buildPhone(String brandName,String type, Map<String,String> metadata){
        switch (brandName){
            case "realme": return (Mobiles) new RealMe().build(brandName,type, metadata);
            case "iphone": return (Mobiles) new Iphone().build(brandName,type, metadata);
        }
        return null;
    }

}
