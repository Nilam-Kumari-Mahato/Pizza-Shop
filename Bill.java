package PizzaShop;

import java.sql.*;

public class Bill {
    void pizza_bill(String pno){
        System.out.println("***** Your BiLL *****");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); //type 4 driver's other name is thin
            Statement stmt = con.createStatement();
            String q1 = "select * from pizzamenu where p_no = '" + pno + "'";
            ResultSet rs = stmt.executeQuery(q1);
            if (rs.next()) {
                System.out.println("PizzaNo. : " + rs.getString(1));
                System.out.println("PizzaName: " + rs.getString(2));
                System.out.println("Size: " + rs.getString(3));
                System.out.println("Total Bill: " + rs.getString(4));
            }
            else{
                System.out.println("***SORRY ABOVE DETAILED PIZZA NOT AVAILABLE***");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
