import java.util.Scanner;

class librarybookc{
    String title,author;
    int price;
    librarybookc(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
class librarybook{
    public static void main (String [] args){
    System.out.println("Library Book Details:");
        System.out.println("----------------------");
        System.out.println("Enter book details:");
        System.out.println("Title: ");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();  
        System.out.println("Author: ");
        String author = sc.nextLine();
        System.out.println("Price: ");
        int price = sc.nextInt();
        librarybookc c = new librarybookc(title, author, price);
        c.display();
        
    }
}