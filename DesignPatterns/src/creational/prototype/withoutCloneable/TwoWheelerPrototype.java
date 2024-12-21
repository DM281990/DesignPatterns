package creational.prototype.withoutCloneable;

import creational.prototype.Vehicle;

public class TwoWheelerPrototype {

    public static Vehicle build(){
         Vehicle vehicle = new Vehicle();
         vehicle.numberOfWheels=2;
         return vehicle;
    }

}
