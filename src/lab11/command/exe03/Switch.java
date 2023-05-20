package lab11.command.exe03;

public class Switch {
    private Command upCommand;
    private Command downCommand;

    public Switch(Command up, Command down) {
        this.upCommand = up;
        this.downCommand = down;
    }

    public void flipUp() {
        upCommand.execute();
    }

    public void flipDown() {
        downCommand.execute();
    }
}
