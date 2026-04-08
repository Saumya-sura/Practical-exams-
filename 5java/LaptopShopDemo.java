// Q8: Online shopping system with multi-level inheritance
class Product {
    String productName;
    double price;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

class Electronics extends Product {
    int warrantyPeriod; // in months
    Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    void showWarrantyDetails() {
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Laptop extends Electronics {
    int batteryBackup; // in hours
    Laptop(String productName, double price, int warrantyPeriod, int batteryBackup) {
        super(productName, price, warrantyPeriod);
        this.batteryBackup = batteryBackup;
    }
    void displayLaptopSpecifications() {
        System.out.println("Laptop Name: " + productName);
        System.out.println("Price: Rs. " + price);
        showWarrantyDetails();
        System.out.println("Battery Backup: " + batteryBackup + " hours");
    }
}

public class LaptopShopDemo {
    public static void main(String[] args) {
        Laptop l = new Laptop("Dell Inspiron 15", 55000, 24, 8);
        l.displayLaptopSpecifications();
    }
}
