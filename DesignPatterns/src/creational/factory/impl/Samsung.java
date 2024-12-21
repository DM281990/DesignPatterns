package creational.factory.impl;

import creational.factory.Mobile;

public class Samsung implements Mobile {
    @Override
    public Mobile createMobile() {
        return new Samsung();
    }
}
