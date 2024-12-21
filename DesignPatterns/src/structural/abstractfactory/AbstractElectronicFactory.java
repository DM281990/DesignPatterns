package structural.abstractfactory;

import structural.abstractfactory.mobilefactory.MobileFactory;
import structural.abstractfactory.refrigeratorfactory.Refrigerator;
import structural.abstractfactory.refrigeratorfactory.RefrigeratorFactory;
import structural.abstractfactory.tvfactory.TvFactory;

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
