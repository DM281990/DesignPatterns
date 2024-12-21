package creational.abstractfactory.mobilefactory.impl;

import creational.abstractfactory.Electronic;
import creational.abstractfactory.mobilefactory.Mobiles;

import java.util.Map;

public class RealMe extends Mobiles {
    public String getRealmeVersion() {
        return realmeVersion;
    }

    public void setRealmeVersion(String realmeVersion) {
        this.realmeVersion = realmeVersion;
    }

    String realmeVersion;
    @Override
    public Electronic build(String brandName, String type, Map<String, String> metadata) {
        RealMe realme =new RealMe();
        realme.setType(type);
        realme.setOs(metadata.get("os"));
        realme.setBrandName(brandName);
        realme.setRealmeVersion(metadata.get("realmeVersion"));
        return realme;
    }
}
