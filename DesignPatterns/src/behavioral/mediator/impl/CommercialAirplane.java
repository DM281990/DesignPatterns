package behavioral.mediator.impl;

import behavioral.mediator.AirTrafficControlTower;
import behavioral.mediator.Airplane;

// Concrete Colleague
public class CommercialAirplane implements Airplane {
    private AirTrafficControlTower mediator;

    public CommercialAirplane(AirTrafficControlTower mediator) {
        this.mediator = mediator;
    }

    @Override
    public void requestTakeoff() {
        mediator.requestTakeoff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Commercial Airplane: " + message);
    }
}