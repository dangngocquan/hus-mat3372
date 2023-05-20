package lab11.command.exe03;

public class TVTurnOnCommand implements Command {
    private TV tv;

    public TVTurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }
}
