package lab11.command.exe03;

public class TVTurnOffCommand implements Command {
    private TV tv;

    public TVTurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }
}
