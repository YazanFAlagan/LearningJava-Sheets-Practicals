public static void main(String[] args) {

    SmartPhones S1 = new SmartPhones("Samsung", "Note 20 Ultra 5G", 256);

    // getter and setter methods
    System.out.println("Brand: " + S1.getBrand());
    System.out.println("Model: " + S1.getModel());
    System.out.println("Storage Capacity: " + S1.getStorageCapacity() + "GB");

    System.out.println("_______________________________________________");

    // Increase storage capacity
    S1.increaseStorage(256);
    System.out.println("Total Updated Storage Capacity: " + S1.getStorageCapacity() + "GB");
}