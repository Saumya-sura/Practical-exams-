import java.util.List;
import java.util.ArrayList;
public class crud{
    public static void main (String[] args){
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        System.out.println("Items: " + items);
        String in1 = items.get(0);
        System.out.println("Read: " + in1);
        int inof = items.indexOf("Item 2");
        System.out.println("Index of Item 2: " + inof);

        items.set(1, "Updated Item 2");
        System.out.println("Updated Items: " + items);
         boolean removed = items.remove("Item 3");
       System.out.println("Removed Item 3: " + removed);
        System.out.println("Final Items: " + items);

        System.out.println("Size of items: " + items.size());
        System.out.println("final list: " + items);

    }
}