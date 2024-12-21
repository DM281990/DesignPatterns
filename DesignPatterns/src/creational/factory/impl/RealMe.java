package creational.factory.impl;

import creational.factory.Mobile;

public class RealMe implements Mobile {
    @Override
    public Mobile createMobile() {
        return new RealMe();
    }
}
