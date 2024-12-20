package structural.factory.impl;

import structural.factory.Mobile;

public class Samsung implements Mobile {
    @Override
    public Mobile createMobile() {
        return new Samsung();
    }
}
