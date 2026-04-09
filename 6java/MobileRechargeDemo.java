// MobileRechargePlan.java
// Abstract class for mobile recharge plans

abstract class MobileRechargePlan {
    String planName;
    double planAmount;
    int validityDays;

    public MobileRechargePlan(String planName, double planAmount, int validityDays) {
        this.planName = planName;
        this.planAmount = planAmount;
        this.validityDays = validityDays;
    }

    abstract void displayPlanDetails();
    abstract double calculateRechargeAmount(double talkTime);
}

// PrepaidRecharge class
class PrepaidRecharge extends MobileRechargePlan {
    public PrepaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    @Override
    void displayPlanDetails() {
        System.out.println("Prepaid Plan: " + planName + ", Amount: " + planAmount + ", Validity: " + validityDays + " days");
    }

    @Override
    double calculateRechargeAmount(double talkTime) {
        // For prepaid, assume talkTime is deducted from planAmount at Rs. 1 per minute
        double remaining = planAmount - talkTime;
        System.out.println("Remaining balance after " + talkTime + " min talk: Rs. " + remaining);
        return remaining;
    }
}

// PostpaidRecharge class
class PostpaidRecharge extends MobileRechargePlan {
    public PostpaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    @Override
    void displayPlanDetails() {
        System.out.println("Postpaid Plan: " + planName + ", Monthly Rental: " + planAmount + ", Validity: " + validityDays + " days");
    }

    @Override
    double calculateRechargeAmount(double talkTime) {
        // For postpaid, assume Rs. 0.8 per minute is charged extra for talkTime
        double total = planAmount + (talkTime * 0.8);
        System.out.println("Total bill for " + talkTime + " min talk: Rs. " + total);
        return total;
    }
}

// Main class to test
public class MobileRechargeDemo {
    public static void main(String[] args) {
        PrepaidRecharge prepaid = new PrepaidRecharge("SuperSaver", 200, 28);
        PostpaidRecharge postpaid = new PostpaidRecharge("Premium", 399, 30);

        prepaid.displayPlanDetails();
        prepaid.calculateRechargeAmount(50);

        System.out.println();

        postpaid.displayPlanDetails();
        postpaid.calculateRechargeAmount(50);
    }
}
