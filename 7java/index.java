import java.util.Scanner;

public class index {
    public static void main(String[] args) {
      try{
        // array eleemtns of size 5
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an index to access the array: ");
        int index = sc.nextInt();

        // Accessing the array element at the specified index
        int element = arr[index];
        System.out.println("Element at index " + index + ": " + element);


      }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
    }finally{
        System.out.println("This block will always execute.");
    }
    }
}
