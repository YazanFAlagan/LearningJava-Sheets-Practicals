public static void main(String[] args) {
    House h1 = new House("10 Saed ST - Tanta - Gharbia", 4, 150);

    // getter and setter methods
    System.out.println("Address: " + h1.getAddress());
    System.out.println("Number of Rooms: " + h1.getNumberOfRooms());
    System.out.println("Area: " + h1.getArea() + " square meters");

    double pricePerSquareMeter = 1500;
    double housePrice = h1.calculatePrice(pricePerSquareMeter);

    System.out.println("_______________________________________________");

    System.out.println("Price of the house: " + housePrice + " EGP");
}