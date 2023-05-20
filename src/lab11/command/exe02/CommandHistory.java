package lab11.command.exe02;

import java.util.Arrays;

public class CommandHistory {
    private Command[] history;

    public void push(Command c) {
        Command[] newHistory = Arrays.copyOf(history, history.length + 1);
        newHistory[history.length] = c;
        this.history = newHistory;
    }

    public Command pop() {
        if (history.length > 0) {
            Command c = this.history[history.length-1];
            Command[] newHistory = Arrays.copyOf(history, history.length - 1);
            this.history = newHistory;
            return c;
        }
        return null;
    }
}
