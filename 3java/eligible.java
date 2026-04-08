import java.util.Scanner;

class elg{
    int no;
    int attendance;
    elg(int no,int attendance){
        this.no=no;
        this.attendance=attendance;
    }
    void input(){
        System.out.println("Enter the no of lecs held ");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();

        System.out.println("Enter the attendance: ");
        attendance = sc.nextInt();

    }
    void compute(){
        float percentage = (attendance*100)/no;
        if(percentage>=80){
            System.out.println("Eligible for exam");
        }
        else{
            System.out.println("Not eligible for exam");
        }
    }
}


public class eligible {
    public static void main(String[] args) {
        elg e = new elg(0, 0);
        e.input();
        e.compute();
    }
}
