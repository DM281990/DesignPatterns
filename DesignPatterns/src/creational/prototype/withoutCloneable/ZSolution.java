package creational.prototype.withoutCloneable;

import creational.prototype.Vehicle;

public class ZSolution {
    public static void main(String[] args) {
        // building from Four wheeler type prototype and modifying a variable outside the realm of prototype
        Vehicle vehicle = FourWheelerPrototype.build();
        vehicle.engine="1000CC";
        // building from Two wheeler type prototype and modifying a variable outside the realm of prototype
        vehicle = TwoWheelerPrototype.build();
        vehicle.engine="100CC";
    }
}
