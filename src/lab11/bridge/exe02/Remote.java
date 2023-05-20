package lab11.bridge.exe02;

public class Remote {
    private Device device;

    public void togglePower() {
        if (device.isEnable()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public Device getDevice() {
        return device;
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
