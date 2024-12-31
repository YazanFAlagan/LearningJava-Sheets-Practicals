public class Product {
    private String productName;
    private int productCode;
    private double price;

    // Constructor
    public Product(String productName, int productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    // Default
    public Product() {
        this.productName = "كله حلو";
        this.productCode = 0;
        this.price = 0.0;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Discount Method
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = price * (percentage / 100);
            price -= discountAmount;
            System.out.println("Discount : " + percentage + "%");
        } else {
            System.out.println("Invalid discount percentage.");
        }
}
}
