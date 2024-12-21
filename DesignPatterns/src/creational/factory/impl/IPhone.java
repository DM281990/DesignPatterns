package creational.factory.impl;

import creational.factory.Mobile;

public class IPhone implements Mobile {
    @Override
    public Mobile createMobile() {
        return new IPhone();
    }
}
