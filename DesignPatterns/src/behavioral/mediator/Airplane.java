package behavioral.mediator;

// Colleague Interface
public interface Airplane {
    public void requestTakeoff();
    public void requestLanding();
    public void notifyAirTrafficControl(String message);
}