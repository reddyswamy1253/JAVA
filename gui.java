//graphical user interface 
import javax.swing.JOptionPane;
public class gui{
    public static void main(String[]args){
        String name=JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, name);
        int age=Integer.parseInt(showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "you are "+age+"old");
        double height=Double.parseDouble(showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null, "you are "+height+"cm");

    }
}
