package HostelRegister;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class In extends JPanel
{
    In(JFrame parent)
    {
        JLabel l1 = new JLabel("IN");
        JLabel l2 = new JLabel("Arrival Time: ");
        JLabel l3 = new JLabel("Arrival Date: ");
        JLabel l4 = new JLabel("UID: ");
        JButton b1 = new JButton("Proceed with entry!");

        JTextField t2 = new JTextField(); //arrival time textfield
        JTextField t3 = new JTextField(); //arrival date textfield 
        JPasswordField t4 = new JPasswordField(); //UID textfield 
        l1.setBounds(210,10,50,30); //IN coords 
        l2.setBounds(90,60,100,30); //arrival time coords
        l3.setBounds(90,90,100,30); //arrival date coords
        l4.setBounds(90,120,100,30);
        b1.setBounds(140,210,200,30); //proceed button 
  
        t2.setBounds(190,60,100,30); //arrival time textfield
        t3.setBounds(190,90,100,30); //arrival date textfield
        t4.setBounds(190,120,100,30); //UID passwordfield coords
        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t2);
        add(t3);
        add(t4);
        add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String arrtime = t2.getText();
                String arrdate = t3.getText();
                String password = new String(t4.getPassword());
                try
                {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_register", "root", "tenbit-10bitmate");
                    String query = "INSERT INTO in_table values('"+ password + "','" + arrtime + "','" + arrdate +"')";
                    Statement sta = connection.createStatement();
                
                    JOptionPane.showMessageDialog(b1, "Welcome Back");    
                    parent.getContentPane().setVisible(false);
                    parent.setContentPane(new start(parent)); 
                    connection.close();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        //if proceed button is pressed
    }
}