package structural.abstractfactory;

import java.util.Map;

public abstract class Electronic {
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    String brandName;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    public abstract Electronic build(String brandName, String type, Map<String, String> metadata);

}
