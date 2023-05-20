package lab11.command.exe03;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOnCommand = new TVTurnOnCommand(tv);
        Command turnOffCommand = new TVTurnOnCommand(tv);

        Switch switchTV = new Switch(turnOnCommand, turnOffCommand);

        switchTV.flipUp();  // TV is turn on.
        switchTV.flipDown();    // TV is turn off.
    }
}
