package creational.prototype.withcloneable;

import creational.prototype.Vehicle;

public class TwoWheelerPrototype implements Cloneable{
    Vehicle vehicle;

    public TwoWheelerPrototype(){
        vehicle = new Vehicle();
        vehicle.numberOfWheels=2;
    }

    @Override
    public TwoWheelerPrototype clone() {
        try {
            TwoWheelerPrototype clone = (TwoWheelerPrototype) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
