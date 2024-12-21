package structural.facade;

import structural.facade.component.RoomLights;
import structural.facade.component.SoundSystem;
import structural.facade.component.TelevisionSystem;

public class HomeTheatreFacade {
    SoundSystem soundSystem;
    TelevisionSystem televisionSystem;
    RoomLights roomLights;

    public HomeTheatreFacade(SoundSystem soundSystem,
    TelevisionSystem televisionSystem,
    RoomLights roomLights){
        this.roomLights=roomLights;
        this.soundSystem=soundSystem;
        this.televisionSystem=televisionSystem;
    }
    public void turnOnHomeTheatre(){
        System.out.println("Turn On Home theatre");
        this.roomLights.turnLightsOff();
        this.soundSystem.turnSoundSystemOn();
        this.televisionSystem.turnTelevisionOn();
    }
    public void turnTelevisionOff(){
        this.televisionSystem.turnTelevisionOff();
        this.soundSystem.turnSoundSystemOff();
        this.roomLights.turnLightsOn();
        System.out.println("Turn Off Home theatre");
    }
}
