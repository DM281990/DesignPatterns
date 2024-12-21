package creational.abstractfactory.tvfactory;

import creational.abstractfactory.tvfactory.impl.Samsung;
import creational.abstractfactory.tvfactory.impl.Sony;

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
