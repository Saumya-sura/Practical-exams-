class flight{
    void fly(){
        System.out.println("Flight is flying");
    }
}
class Cargo extends flight{
    @Override
    void fly(){
        System.out.println("Cargo flight is flying");
    }
}
class Passenger extends flight{
    @Override
    void fly(){
        System.out.println("Passenger flight is flying");
    }
}

public class fflightt {
    public static void main(String[] args) {
        Cargo c = new Cargo();
        Passenger p = new Passenger();

        c.fly();
        p.fly();
    }
}
