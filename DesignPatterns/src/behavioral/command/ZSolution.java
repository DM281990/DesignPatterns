package behavioral.command;

import behavioral.command.impl.TubeLightOffCommand;
import behavioral.command.impl.TubeLightOnCommand;

public class ZSolution {
    public static void main(String[] args) {
        Tubelight tubelight = new Tubelight();
        TubeLightOnCommand onCommand = new TubeLightOnCommand(tubelight);
        TubeLightOffCommand offCommand = new TubeLightOffCommand(tubelight);
        RemoteControl remoteControl =new RemoteControl();
        remoteControl.setCommand(onCommand);
        remoteControl.eval();
        remoteControl.setCommand(offCommand);
        remoteControl.eval();
    }
}
