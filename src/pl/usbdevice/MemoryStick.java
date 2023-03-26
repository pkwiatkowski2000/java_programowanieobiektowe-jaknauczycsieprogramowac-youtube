package pl.usbdevice;

public class MemoryStick implements USBDevice {
    private String name;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected Memory Stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("Please eject Memory Stick first");
            return false;
        } else {
            System.out.println("Memory Stick disconnected");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
