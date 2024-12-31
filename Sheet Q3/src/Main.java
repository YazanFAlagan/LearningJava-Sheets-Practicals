public class Main {
    public static void main(String[] args) {
        // Create Desktop object
        Desktop d1 = new Desktop("HP ENVY dv6", "Core I7", 8);

        // Access properties using getter methods
        System.out.println("Brand: " + d1.getBrand());
        System.out.println("Processor: " + d1.getProcessor());
        System.out.println("RAM Size: " + d1.getRamSize() + "GB");

        System.out.println("_______________________________________________");

        // Increase storage capacity
        d1.increaseStorage(8);
        System.out.println("Total Updated RAM Capacity: " + d1.getRamSize() + "GB");
    }
}
