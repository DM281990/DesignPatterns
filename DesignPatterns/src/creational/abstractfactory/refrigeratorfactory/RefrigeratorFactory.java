package creational.abstractfactory.refrigeratorfactory;

import creational.abstractfactory.refrigeratorfactory.impl.Godrej;
import creational.abstractfactory.refrigeratorfactory.impl.Whirlpool;

import java.util.Map;

public abstract class RefrigeratorFactory  {
    public static Refrigerator buildRefrigerator(String brandName, String type, Map<String,String> metadata){
        switch (brandName){
            case "godrej": return (Refrigerator) new Godrej().build(brandName,type, metadata);
            case "whirlpool": return (Refrigerator) new Whirlpool().build(brandName,type, metadata);
        }
        return null;
    }
}
