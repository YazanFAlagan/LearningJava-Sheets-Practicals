public class Main {
    public static void main(String[] args) {
        try {
            SmartDevice bulb = new LightBulb("Living Room Bulb", 75);
            SmartDevice thermostat = new Thermostat("Thermostat", 22);

            SmartDevice[] devices = {bulb, thermostat};
            for (SmartDevice device : devices) {
                device.turnOn();
                device.showStatus();
                device.deviceDetails();
                device.turnOff();
                System.out.println();
            }
            bulb.turnOn();
            bulb.turnOn();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage() +" Turn it OFF");
        }
    }
}
