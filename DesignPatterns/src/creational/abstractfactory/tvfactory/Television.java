package creational.abstractfactory.tvfactory;

import creational.abstractfactory.Electronic;

public abstract class Television extends Electronic {
    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    String displayType;
}
