package structural.abstractfactory.tvfactory;

import structural.abstractfactory.Electronic;

import java.util.Map;

public abstract class Television extends Electronic {
    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    String displayType;
}
