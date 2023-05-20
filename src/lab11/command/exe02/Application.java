package lab11.command.exe02;

public class Application {
    public String clipboard;
    public Editor[] editors;
    public Editor activeEditor;
    public CommandHistory history;

    public void createUI() {
//        copy = function() {
//            executeCommand(
//                    new CopyCommand(this, activeEditor)
//            );
//        };
//        copyButton.setCommand(copy);
//        shortcuts.onKeyPress("Ctrl+C", copy);
//
//        cut = function() {
//            executeCommand(
//                    new CutCommand(this, activeEditor)
//            );
//        };
//        cutButton.setCommand(cut);
//        shortcuts.onKeyPress("Ctrl+X", cut);
//
//        paste = function() {
//            executeCommand(
//                    new PasteCommand(this, activeEditor)
//            );
//        };
//        pasteButton.setCommand(paste);
//        shortcuts.onKeyPress("Ctrl+V", paste);
//
//        undo = function() {
//            executeCommand(
//                    new UndoCommand(this, activeEditor)
//            );
//        };
//        undoButton.setCommand(undo);
//        shortcuts.onKeyPress("Ctrl+Z", undo);


    }

    public void executeCommand(Command c) {
        if (c.execute()) {
            history.push(c);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
