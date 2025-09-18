package PizzaShop;
import java.io.*;
import java.sql.*;

class Pizzamenu {
     void pizza_menu() {


        try{
            System.out.println("**Pizza Menu**");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" , "system" , "manager"); //type 4 driver's other name is thin
            Statement stmt=con.createStatement();
            String q1= "select * from pizzamenu " ;
            ResultSet rs= stmt.executeQuery(q1);
            while(rs.next()){
                System.out.println("PizzaNo. : "+rs.getString(1));
                System.out.println("PizzaName: "+rs.getString(2));
                System.out.println("Size: "+rs.getString(3));
                System.out.println("Price: "+rs.getString(4));

            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
