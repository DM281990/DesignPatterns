package creational.abstractfactory.tvfactory.impl;

import creational.abstractfactory.Electronic;
import creational.abstractfactory.tvfactory.Television;

import java.util.Map;

public class Sony extends Television {
    public String getSonyVersion() {
        return sonyVersion;
    }

    public void setSonyVersion(String sonyVersion) {
        this.sonyVersion = sonyVersion;
    }

    String sonyVersion;
    @Override
    public Electronic build(String brandName, String type, Map<String, String> metadata) {
        Sony sony =new Sony();
        sony.setType(type);
        sony.setDisplayType(metadata.get("displayType"));
        sony.setBrandName(brandName);
        sony.setSonyVersion(metadata.get("sonyVersion"));
        return sony;
    }
}
