package structural.abstractfactory.refrigeratorfactory;

import structural.abstractfactory.Electronic;

import java.util.Map;

public class Refrigerator extends Electronic {
    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    public String compressorType;
    @Override
    public Electronic build(String brandName, String type, Map<String, String> metadata) {
        return null;
    }
}
