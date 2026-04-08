class account{
    int accno;
    double bal;
     
    account(int accno, double bal){
        if(accno>0){
            this.accno=accno;
        }
        else{
            System.out.println("Invalid account number");
        }
        if(bal>=0){
            this.bal=bal;
        }
        else{
            System.out.println("Invalid balance");
        }
    }
}

public class acc {
    public static void main(String[] args) {
        account a = new account(123, 1000);
        System.out.println("Account number: "+a.accno);
        System.out.println("Balance: "+a.bal);
    }
}
