package creational.prototype.withcloneable;

import creational.prototype.Vehicle;

public class FourWheelerPrototype implements Cloneable{
    Vehicle vehicle;
    public FourWheelerPrototype(){
        vehicle = new Vehicle();
        vehicle.numberOfWheels=4;
    }

    @Override
    public FourWheelerPrototype clone() {
        try {
            FourWheelerPrototype clone = (FourWheelerPrototype) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
