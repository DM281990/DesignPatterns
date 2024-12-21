package creational.prototype.withcloneable;

import creational.prototype.Vehicle;

public class ZSolution {
    public static void main(String[] args) {
        // building from Four wheeler type prototype using clone and modifying a variable outside the realm of prototype
        FourWheelerPrototype fourWheelerPrototype= new FourWheelerPrototype();
        Vehicle vehicle1 = fourWheelerPrototype.clone().vehicle;
        vehicle1.engine="1000CC";
        // building from Two wheeler type prototype using clone and modifying a variable outside the realm of prototype
        Vehicle vehicle2 = fourWheelerPrototype.clone().vehicle;
        vehicle2.engine="1000CC";
    }
}
