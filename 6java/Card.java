// Abstract class Payment
abstract class Payment {
    protected String cardNumber;
    protected String cardHolder;
    protected double amount;

    public Payment(String cardNumber, String cardHolder, double amount) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.amount = amount;
    }

    // Abstract methods
    abstract void processPayment();
    abstract void displayPaymentDetails();
}


// Concrete class CreditCardPayment
class CreditCardPayment extends Payment {
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, double amount, String expiryDate) {
        super(cardNumber, cardHolder, amount);
        this.expiryDate = expiryDate;
    }

    @Override
    void processPayment() {
        System.out.println("Credit Card Payment Processed");
    }

    @Override
    void displayPaymentDetails() {
        System.out.println("Cardholder: " + cardHolder);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Amount: Rs. " + amount);
    }
}

// Concrete class DebitCardPayment
class DebitCardPayment extends Payment {
    private int pin;

    public DebitCardPayment(String cardNumber, String cardHolder, double amount, int pin) {
        super(cardNumber, cardHolder, amount);
        this.pin = pin;
    }

    @Override
    void processPayment() {
        System.out.println("Debit Card Payment Processed");
    }

    @Override
    void displayPaymentDetails() {
        System.out.println("Cardholder: " + cardHolder);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Pin: " + pin);
        System.out.println("Amount: Rs. " + amount);
    }
}

// Demo class
public class Card {
    public static void main(String[] args) {
        CreditCardPayment creditPayment = new CreditCardPayment("1234567890123456", "John Doe", 2500.0, "12/28");
        DebitCardPayment debitPayment = new DebitCardPayment("9876543210987654", "Jane Smith", 1500.0, 1234);

        creditPayment.processPayment();
        creditPayment.displayPaymentDetails();
        System.out.println();
        debitPayment.processPayment();
        debitPayment.displayPaymentDetails();
    }
}
