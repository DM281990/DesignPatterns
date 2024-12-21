package behavioral.command;

public class RemoteControl {
    public void eval() {
        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    Command command;

}
