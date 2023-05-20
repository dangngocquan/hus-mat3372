package lab11.command.exe01;

public class TestCommand {
    public static void main(String[] args) {
        Switch aSwitch = new Switch();

        Computer computer = new Computer();

        Command restartCommand = new RestartCommand(computer);
        aSwitch.storeAndExecute(restartCommand);    // Computer restart

        Command shutdownCommand = new ShutdownCommand(computer);
        aSwitch.storeAndExecute(shutdownCommand);   // Computer shutdown
    }
}
