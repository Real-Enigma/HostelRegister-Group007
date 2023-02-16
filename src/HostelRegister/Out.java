package HostelRegister;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Out extends JPanel {
    private JPanel contentPane;
    private JTextField Name;
    private JTextField Phone_number;
    private JTextField roomno;
    private JTextField time;
    private JTextField date;
    private JPasswordField UID;
    private JButton b1;
    Out(JFrame parent){
        JLabel l1 = new JLabel("OUT"); 
        JLabel l2 = new JLabel("Name: "); 
        JLabel l3 = new JLabel("Phone number: ");
        JLabel l4 = new JLabel("Room number: ");
        JLabel l5 = new JLabel("Time: ");
        JLabel l6 = new JLabel("Date: ");
        JLabel l7 = new JLabel("UID: ");

        JTextField t1 = new JTextField(); //name textfield 
        JTextField t2 = new JTextField(); //phone no textfield 
        JTextField t3 = new JTextField(); //room no textfield 
        JTextField t4 = new JTextField(); //time textfield 
        JTextField t5 = new JTextField(); //date textfield 
        JPasswordField t6 = new JPasswordField(); //UID textfield 

        //JTextField t7 = new JTextField(); //safe trip textfield 

        JButton b1 = new JButton("Proceed for Departure!"); 

        l1.setBounds(210,10,100,50); //OUT coords
        l2.setBounds(90,50,90,30); //name coords
        l3.setBounds(90,90,90,30); //phone no. coords
        l4.setBounds(90,130,90,30); //room no. coords
        l5.setBounds(90,170,90,30); //time coords 
        l6.setBounds(90,210,90,30); //date coords
        l7.setBounds(90,250,90,30); //UID coords

        t1.setBounds(190,50,100,30); //name textfield coords
        t2.setBounds(190,90,100,30); //phone no textfield coords
        t3.setBounds(190,130,100,30); //room no textfield coords 
        t4.setBounds(190,170,100,30); //time textfield coords
        t5.setBounds(190,210,100,30); //date textfields coords 
        t6.setBounds(190,250,100,30); //UID textfield coords
        //t7.setBounds(140,400,210,50); //safe trip coords 

        b1.setBounds(160,320,170,30); //procced coords 

        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        //add(t7);
        add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Name= t1.getText();
                String Phone_Number = t2.getText();
                String roomno = t3.getText();
                String time = t4.getText();
                String date = t5.getText();
                String password = new String(t6.getPassword());
                try
                {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_register", "root", "tenbit-10bitmate");
                    String query = "INSERT INTO out_table values('" + Name + "','" + Phone_Number + "','" + roomno + "','" +time + "','" + date + "','" + password + "')";
                    /*Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        add(t7);
                    }*/
                    JOptionPane.showMessageDialog(b1, "Have A Safe Journey!");    
                    parent.getContentPane().setVisible(false);
                    parent.setContentPane(new start(parent));
                    connection.close();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
        //contentPane.add(b1);
        parent.getContentPane().setVisible(false);
        parent.setContentPane(new start(parent));
            }
            } );
        }
    }