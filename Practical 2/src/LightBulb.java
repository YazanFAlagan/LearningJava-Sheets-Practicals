class LightBulb extends SmartDevice {
    private int bright;
    public LightBulb(String deviceName, int brightness) throws Exception {
        super(deviceName);
        this.bright = brightness;
    }
    @Override
    public void deviceDetails() {
        System.out.println(getDeviceName() + " brightness level: " + bright + "%");
    }
}