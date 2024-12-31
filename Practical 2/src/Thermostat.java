class Thermostat extends SmartDevice {
    private int temp;
    public Thermostat(String deviceName, int temperature) throws Exception {
        super(deviceName);
        this.temp = temperature;
    }
    @Override
    public void deviceDetails() {
        System.out.println(getDeviceName() + " temperature setting: " + temp + "C");
    }
}