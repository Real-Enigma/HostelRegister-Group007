package HostelRegister;
import java.sql.ResultSet;
import HostelRegister.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class start extends JPanel  {
    public JFrame parentFrame = null; 
    ResultSet rs=null;
    start(JFrame parent){
       
        JLabel l1 = new JLabel("A Hostel Register System");
        JLabel l2 = new JLabel("The In's & Out's");
        JButton b1 = new JButton("OUT");
        JButton b2 = new JButton("IN");
        parent.getContentPane().setBackground(new Color(131, 198, 201));
        l1.setBounds(160,10,150, 50); //login coords 
        l2.setBounds(184,50,150,50); //title coords
        b2.setBounds(290,320,100, 30); //login coords 
        b1.setBounds(90,320,100,30); //proceed coords 
        setLayout(null);
        add(b1);
        add(b2);
        add(l1);
        add(l2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.getContentPane().setVisible(false);
                parent.setContentPane(new Out(parent)); //if OUT button is pressed 
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.getContentPane().setVisible(false);
                parent.setContentPane(new In(parent)); //if OUT button is pressed 
            }
        });
        //parent.getContentPane().setVisible(false);
        //parent.setContentPane(new Out(parent)); //if OUT button is pressed 
        //parent.setContentPane(new In(parent)); //if IN button is pressed 
    }
}
