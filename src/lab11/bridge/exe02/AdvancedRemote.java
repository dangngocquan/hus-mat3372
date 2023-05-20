package lab11.bridge.exe02;

public class AdvancedRemote extends Remote {
    public void mute() {
        getDevice().setVolume(0);
    }
}
