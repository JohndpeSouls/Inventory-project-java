package inventory; //constructor

public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity){
        this.productName = productName.trim();
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price){
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity){
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public void setProductName(String productName) {
        if (!productName.trim().isEmpty()) {
            this.productName = productName.trim();
        }
    }

    @Override
    public String toString() {
        return String.format("%-15s %10.2f %10d", productName, price, quantity);
    }
}


