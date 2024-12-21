package creational.abstractfactory;

import creational.abstractfactory.mobilefactory.MobileFactory;
import creational.abstractfactory.refrigeratorfactory.RefrigeratorFactory;
import creational.abstractfactory.tvfactory.TvFactory;

import java.util.Map;

public class AbstractElectronicFactory {

    public static Electronic buildProduct(String brandName, String type, Map<String,String> metadata){
        switch (type) {
            case "mobile":
                return MobileFactory.buildPhone(brandName,type,metadata);
            case"refrigerator":
                return RefrigeratorFactory.buildRefrigerator(brandName,type,metadata);
            case "television":
                return TvFactory.buildTelevision(brandName,type,metadata);
        }
        return null;
    }

}
