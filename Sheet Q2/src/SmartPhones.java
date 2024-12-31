public class SmartPhones {
    private String brand;
    private String model;
    private int storageCapacity;

    // Constructor
    public SmartPhones(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    // Default
    public SmartPhones() {
        this.brand = "إن شاء الله";
        this.model = "أحدث حاجة";
        this.storageCapacity = 1000;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity >= 0) {
            this.storageCapacity = storageCapacity;
        } else {
            System.out.println("Storage capacity must be non-negative.");
        }
    }

    // Increasing Method
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            this.storageCapacity += additionalStorage;
            System.out.println("The Added Storage " + additionalStorage + "GB.");
        } else {
            System.out.println("Add positive Storage Num.");
        }
    }
}