import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class applet extends JFrame implements ActionListener 
{
    JPanel p;
    JButton ba,btnW,btnD,btnE;
    public applet(){
        setTitle("JAva Containers");
        setSize(200,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new JPanel();
        p.setLayout(new FlowLayout());
        ba = new JButton("applet");
        btnW = new JButton("Window");
        btnD = new JButton("Dialog");
        btnE = new JButton("Exit");

        ba.addActionListener(this);
        btnW.addActionListener(this);
        btnD.addActionListener(this);
        btnE.addActionListener(this);


        p.add(ba);
        p.add(btnW);
        p.add(btnD);
        p.add(btnE);
        add(p);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == ba){
            JOptionPane.showMessageDialog(this, "This is an applet");
        }
        else if(e.getSource() == btnW){
            JFrame frame = new JFrame("New Window");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
        else if(e.getSource() == btnD){
            JDialog dialog = new JDialog(this, "Dialog", true);
            dialog.setLayout(new FlowLayout());
            JLabel label = new JLabel("This is a dialog");
            dialog.add(label);
            dialog.setSize(200, 150);
            dialog.setVisible(true);
        }
        else if(e.getSource() == btnE){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new applet();
    }
    
}
