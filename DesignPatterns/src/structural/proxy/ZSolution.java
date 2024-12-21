package structural.proxy;

import structural.proxy.impl.ExpensiveObjectProxy;

public class ZSolution {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
