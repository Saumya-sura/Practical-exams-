abstract class shape{
    void area(){
        System.out.println("Area of 3D shape");
    }
    void perimeter(){
        System.out.println("Perimete of 3D shape");
    }

}
class rectangle extends shape{
    @Override
    void area(){
        System.out.println("Area of rectangle");
    }
    @Override
    void perimeter(){
        System.out.println("Perimeter of rectangle");
    }
}
class circle extends shape{
    @Override
    void area(){
        System.out.println("Area of circle");
    }
    @Override
    void perimeter(){
        System.out.println("Perimeter of circle");
    }
}

public class shaped{
    public static void main(String[] args) {
        rectangle r = new rectangle();
        circle c = new circle();

        r.area();
        r.perimeter();

        c.area();
        c.perimeter();
    }
}
