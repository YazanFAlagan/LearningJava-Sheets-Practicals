public class Desktop {
    private String brand;
    private String processor;
    private int  ramSize;

    // Constructor
    public Desktop(String brand, String processor, int ramSize) {
        this.brand = brand;
        this.processor = processor;
        this. ramSize = ramSize;
    }

    // Default
    public Desktop() {
        this.brand = "إن شاء الله";
        this.processor = "أحدث حاجة";
        this.ramSize = 8;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    // Increasing Method
    public void increaseStorage(int AdditionalRamSize) {
        if (AdditionalRamSize > 0) {
            this.ramSize += AdditionalRamSize;
            System.out.println("The Added RAM Size " + AdditionalRamSize + "GB.");
        } else {
            System.out.println("Add positive RAM Num.");
        }
    }
}