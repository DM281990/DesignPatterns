package structural.factory.impl;

import structural.factory.Mobile;

public class RealMe implements Mobile {
    @Override
    public Mobile createMobile() {
        return new RealMe();
    }
}
