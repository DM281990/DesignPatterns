package structural.abstractfactory.tvfactory;

import structural.abstractfactory.AbstractElectronicFactory;
import structural.abstractfactory.mobilefactory.Mobiles;
import structural.abstractfactory.mobilefactory.impl.Iphone;
import structural.abstractfactory.mobilefactory.impl.RealMe;
import structural.abstractfactory.refrigeratorfactory.Refrigerator;
import structural.abstractfactory.tvfactory.impl.Samsung;
import structural.abstractfactory.tvfactory.impl.Sony;

import java.util.Map;

public abstract class TvFactory  {
    public static Television buildTelevision(String brandName, String type, Map<String,String> metadata){
        switch (brandName){
            case "samsung": return (Television) new Samsung().build(brandName,type, metadata);
            case "sony": return (Television) new Sony().build(brandName,type, metadata);
        }
        return null;
    }
}
