package lab11.bridge.exe02;

public class TV implements Device {
    private boolean isEnable;
    private int volume;
    private int channel;

    @Override
    public boolean isEnable() {
        return isEnable;
    }

    @Override
    public void enable() {
        isEnable = true;
    }

    @Override
    public void disable() {
        isEnable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
