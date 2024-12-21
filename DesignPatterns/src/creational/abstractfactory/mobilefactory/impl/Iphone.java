package creational.abstractfactory.mobilefactory.impl;

import creational.abstractfactory.Electronic;
import creational.abstractfactory.mobilefactory.Mobiles;

import java.util.Map;

public class Iphone extends Mobiles {
    public String getIphoneVersion() {
        return iphoneVersion;
    }

    public void setIphoneVersion(String iphoneVersion) {
        this.iphoneVersion = iphoneVersion;
    }

    String iphoneVersion;
    @Override
    public Electronic build(String brandName, String type, Map<String, String> metadata) {
        Iphone iphone =new Iphone();
        iphone.setType(type);
        iphone.setOs(metadata.get("os"));
        iphone.setBrandName(brandName);
        iphone.setIphoneVersion(metadata.get("iphoneVersion"));
        return iphone;
    }
}
