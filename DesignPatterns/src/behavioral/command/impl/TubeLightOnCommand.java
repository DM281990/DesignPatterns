package behavioral.command.impl;

import behavioral.command.Command;
import behavioral.command.Tubelight;

public class TubeLightOnCommand implements Command {
    Tubelight tubelight;

    public TubeLightOnCommand(Tubelight tubelight) {
        this.tubelight = tubelight;
    }

    @Override
    public void execute() {
        tubelight.turnOn();
    }
}
