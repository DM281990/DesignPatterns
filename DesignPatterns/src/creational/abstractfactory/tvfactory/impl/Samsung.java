package creational.abstractfactory.tvfactory.impl;

import creational.abstractfactory.Electronic;
import creational.abstractfactory.tvfactory.Television;

import java.util.Map;

public class Samsung extends Television {
    public String getSamsungVersion() {
        return samsungVersion;
    }

    public void setSamsungVersion(String samsungVersion) {
        this.samsungVersion = samsungVersion;
    }

    String samsungVersion;
    @Override
    public Electronic build(String brandName, String type, Map<String, String> metadata) {
        Samsung samsung =new Samsung();
        samsung.setType(type);
        samsung.setDisplayType(metadata.get("displayType"));
        samsung.setBrandName(brandName);
        samsung.setSamsungVersion(metadata.get("samsungVersion"));
        return samsung;
    }
}
