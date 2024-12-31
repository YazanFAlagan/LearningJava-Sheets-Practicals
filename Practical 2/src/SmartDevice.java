abstract class SmartDevice implements DeviceOperations {
    private String deviceName;
    private boolean isOn;
    public SmartDevice(String deviceName) throws Exception {
        if (deviceName == null || deviceName.trim().isEmpty()) {
            throw new IllegalArgumentException("Device name cannot be null or empty.");
        }
        this.deviceName = deviceName;
        this.isOn = false;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public boolean isOn() {
        return isOn;
    }
    @Override
    public void turnOn() throws Exception {
        if (isOn) throw new Exception("Device is already ON");
        isOn = true;
        System.out.println(deviceName + " is now ON.");
    }
    @Override
    public void turnOff() {
        if (!isOn) {
            System.out.println(deviceName + " is already OFF.");
        } else {
            isOn = false;
            System.out.println(deviceName + " is now OFF.");
        }
    }
    @Override
    public void showStatus() {
        System.out.println(deviceName + " is " + (isOn ? "ON" : "OFF") + ".");
    }
    public abstract void deviceDetails();
}