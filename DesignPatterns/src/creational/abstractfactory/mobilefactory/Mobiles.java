package creational.abstractfactory.mobilefactory;

import creational.abstractfactory.Electronic;

public abstract class Mobiles extends Electronic {
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    String os;
}
