// C) Method overriding: Bank, SBI, ICICI
class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

public class BankDemoC {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        System.out.println("SBI Interest Rate: " + b1.getRateOfInterest() + "%");
        System.out.println("ICICI Interest Rate: " + b2.getRateOfInterest() + "%");
    }
}
