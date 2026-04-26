public class string {
        //append,rev,isnert using stringbuffer
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "World";

            // Using StringBuffer to append
            StringBuffer sb = new StringBuffer(str1);
            sb.append(" ").append(str2);
            System.out.println("Appended String: " + sb.toString());

            // Using StringBuffer to reverse
            sb.reverse();
            System.out.println("Reversed String: " + sb.toString());

            // Using StringBuffer to insert
            sb.insert(5, " Java");
            System.out.println("String after insertion: " + sb.toString());
        }
}
