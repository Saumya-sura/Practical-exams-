class Shop {
    String name;
    int price;

    // Constructor to initialize product details
    Shop(String name, int price){
        this.name = name;
        this.price = price;
    }

    // Method to calculate bill amount (no discount)
    int calculateBill(int quantity) {
        return price * quantity;
    }

    // Overloaded method to calculate bill with discount (percentage)
    double calculateBill(int quantity, double discountPercent) {
        double total = price * quantity;
        double discount = total * (discountPercent / 100);
        return total - discount;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price per unit: " + price);
    }
}

public class shoppping {
    public static void main(String[] args) {
        Shop product = new Shop("Shirt", 500);
        product.display();

        int quantity = 3;
        int bill = product.calculateBill(quantity);
        System.out.println("Bill amount (no discount) for " + quantity + " items: " + bill);

        double discountedBill = product.calculateBill(quantity, 10.0); // 10% discount
        System.out.println("Bill amount after 10% discount: " + discountedBill);
    }
}
