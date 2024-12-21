package structural.abstractfactory.refrigeratorfactory.impl;

import structural.abstractfactory.Electronic;
import structural.abstractfactory.mobilefactory.impl.Iphone;
import structural.abstractfactory.refrigeratorfactory.Refrigerator;

import java.util.Map;

public class Godrej extends Refrigerator {
    public String getGodrejVersion() {
        return godrejVersion;
    }

    public void setGodrejVersion(String godrejVersion) {
        this.godrejVersion = godrejVersion;
    }

    public String godrejVersion;
    @Override
    public Electronic build(String brandName, String type, Map<String, String> metadata) {
        Godrej godrej =new Godrej();
        godrej.setType(type);
        godrej.setCompressorType(metadata.get("compressor"));
        godrej.setBrandName(brandName);
        godrej.setGodrejVersion(metadata.get("godrejVersion"));
        return godrej;
    }
}
