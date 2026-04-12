import java.util.HashSet;
import java.util.Set;

public class setinterface {
    public static void main (String [] args){
        Set<String> items = new HashSet<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        System.out.println("Items: " + items);

        boolean containsItem2 = items.contains("Item 2");
        System.out.println("Contains Item 2: " + containsItem2);

        items.remove("Item 2");

        System.out.println("size of items: " + items.size());
        System.out.println("is empty?" + items.isEmpty());

        System.out.println("iterating ");
            for(String item : items){
                System.out.println(item);
            }
        items.clear();
        System.out.println("After clearing, is empty? " + items.isEmpty());
        

    }
}
