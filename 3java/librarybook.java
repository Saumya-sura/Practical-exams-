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
        librarybookc c = new librarybookc("harry", "potter", 2);
        c.display();
        
    }
}