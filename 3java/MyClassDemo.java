class MyClass {
    // Default (package-private) visibility
    void myMethod() {
        System.out.println("Default visibility method called");
    }

    // Public visibility
    public void myMethod(int x) {
        System.out.println("Public method called with int: " + x);
    }

    // Protected visibility
    protected void myMethod(String s) {
        System.out.println("Protected method called with String: " + s);
    }

    // Private visibility
    private void myMethod(double d) {
        System.out.println("Private method called with double: " + d);
    }

    // Helper to demonstrate private method
    public void callPrivate(double d) {
        myMethod(d);
    }
}

public class MyClassDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod(); // default
        obj.myMethod(10); // public
        obj.myMethod("hello"); // protected
        obj.callPrivate(3.14); // private (via public helper)
    }
}
