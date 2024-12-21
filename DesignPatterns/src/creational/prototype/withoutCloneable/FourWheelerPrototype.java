package creational.prototype.withoutCloneable;

import creational.prototype.Vehicle;

public class FourWheelerPrototype {
    public static Vehicle build(){
        Vehicle vehicle = new Vehicle();
        vehicle.numberOfWheels=4;
        return vehicle;
    }

}
