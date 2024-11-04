package Tasks.SmartDevice;

public class SmartHome {
    private SmartDevice[] devices;

    public SmartHome(SmartDevice[] devices) {
        this.devices = devices;
    }

    public void turnAllOn() {
        System.out.println("Включить все устройства");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Выключить все устройства");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
