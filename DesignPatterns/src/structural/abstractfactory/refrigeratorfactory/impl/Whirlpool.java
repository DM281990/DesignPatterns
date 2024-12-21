package structural.abstractfactory.refrigeratorfactory.impl;

import structural.abstractfactory.Electronic;
import structural.abstractfactory.refrigeratorfactory.Refrigerator;

import java.util.Map;

public class Whirlpool extends Refrigerator {
    public String getWhirlpoolVersion() {
        return whirlpoolVersion;
    }

    public void setWhirlpoolVersion(String whirlpoolVersion) {
        this.whirlpoolVersion = whirlpoolVersion;
    }

    public String whirlpoolVersion;
    @Override
    public Electronic build(String brandName, String type, Map<String, String> metadata) {
        Whirlpool whirlpool =new Whirlpool();
        whirlpool.setType(type);
        whirlpool.setCompressorType(metadata.get("compressor"));
        whirlpool.setBrandName(brandName);
        whirlpool.setWhirlpoolVersion(metadata.get("whirlpoolVersion"));
        return whirlpool;    }
}
