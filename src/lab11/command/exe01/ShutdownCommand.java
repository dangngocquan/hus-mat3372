package lab11.command.exe01;

public class ShutdownCommand implements Command {
    private Computer computer;

    public ShutdownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.shutdown();
    }
}
