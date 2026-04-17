import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class jframe  implements ActionListener{
   
           JFrame f;
    JPanel p;
    JButton b;
    public jframe(){
    f = new JFrame("My JFrame");
    p = new JPanel();
    b = new JButton("Click Me");

    b.addActionListener(this);
    p.add(b);
    f.add(p);

    f.setSize(400, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    }
    public void  actionPerformed(ActionEvent e){
      JDialog dialog = new JDialog(f, "Button Clicked", true);
        dialog.setLayout(new FlowLayout());
        JLabel label = new JLabel("You clicked the button!");
        dialog.add(label);
        dialog.setSize(250, 150); 
        dialog.setVisible(true);
        System.out.println("Button was clicked!");
    }
        
    public static void main(String[] args) {
        new jframe();
    }
   
}
