public static void main(String[] args) {
    Product P1 = new Product("Mokka Latee", 2, 150);

    // getter and setter methods
    System.out.println("Name: " + P1.getProductName());
    System.out.println("Code: " + P1.getProductCode());
    System.out.println("Price: " + P1.getPrice() );

    System.out.println("_______________________________________________");

    double discountPercentage = 10.5; // %
    P1.applyDiscount(discountPercentage);
    System.out.println("Price after Discount: " + P1.getPrice() + " EGP");
}