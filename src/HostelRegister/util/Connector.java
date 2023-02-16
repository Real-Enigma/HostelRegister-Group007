package HostelRegister.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    Connection c = null;
    Statement cursor = null;
    ResultSet rs=null;

    public Connector(){ // Initialise the connection for some reason ig
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_register", "root", "tenbit-10bitmate");
            cursor = c.createStatement();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet execute(String q) {
        try {
            rs = cursor.executeQuery(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

}