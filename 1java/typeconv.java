public class typeconv {
        public static void main(String[] args) {
            int num = 65;
            char character = (char) num;
            System.out.println("The character representation of ASCII value " + num + " is: " + character);

            // int to double (widening)
            double d = num;
            System.out.println("int to double: " + d);

            // double to int (narrowing)
            double d2 = 42.99;
            int i2 = (int) d2;
            System.out.println("double to int: " + i2);

            // char to int
            char c2 = 'A';
            int i3 = c2;
            System.out.println("char to int: " + i3);

            // float to int
            float f = 23.7f;
            int i4 = (int) f;
            System.out.println("float to int: " + i4);

            // int to String
            String s = Integer.toString(num);
            System.out.println("int to String: " + s);

            // String to int
            String s2 = "123";
            int i5 = Integer.parseInt(s2);
            System.out.println("String to int: " + i5);
        }
}
