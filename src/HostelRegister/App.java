package HostelRegister;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class App {
    
    public static void main(String[] args) throws Exception {
        JFrame Proj = new JFrame("The In's & Out's!");
        
        Proj.setSize(500,500);
        Proj.setContentPane(new start(Proj)); 
        Proj.setVisible(true);
    }
    /*public void connection() {
        
    }*/
}
