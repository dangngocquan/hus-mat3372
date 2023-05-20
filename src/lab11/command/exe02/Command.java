package lab11.command.exe02;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        this.backup = this.editor.text;
    }

    public void undo() {
        this.editor.text = this.backup;
    }

    public abstract boolean execute();
}
