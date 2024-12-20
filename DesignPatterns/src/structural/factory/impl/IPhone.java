package structural.factory.impl;

import structural.factory.Mobile;

public class IPhone implements Mobile {
    @Override
    public Mobile createMobile() {
        return new IPhone();
    }
}
