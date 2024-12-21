package behavioral.command.impl;

import behavioral.command.Command;
import behavioral.command.Tubelight;

public class TubeLightOffCommand implements Command {
    Tubelight tubelight;

    public TubeLightOffCommand(Tubelight tubelight) {
        this.tubelight = tubelight;
    }

    @Override
    public void execute() {
        tubelight.turnOff();
    }
}
