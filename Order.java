package PizzaShop;

import java.util.Scanner;
import java.io.*;
import java.sql.*;

public class Order {
    void orderpizza() throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("** Give Your Order **");
        System.out.println("----Enter Your order details----");
        System.out.println("Enter PizzaNo: ");
        String pno= in.next() ;

        System.out.print("Enter PizzaName: ");
        String pname= in.next();

        System.out.print("Enter size: ");
        String size= in.next();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" , "system" , "manager"); //type 4 driver's other name is thin
            Statement stmt=con.createStatement();
            String q1= "insert into orderpizza values ('"+pno+"' , '"+pname+"' , '"+size+"')";
            int x= stmt.executeUpdate(q1);

            if(x>0){
                System.out.println("Order Placed....");
                System.out.println();
                System.out.println();

                System.out.println("--------------------------------------------------------------------------------");
                Bill bill = new Bill();
                bill.pizza_bill(pno);
                System.out.println("--------------------------------------------------------------------------------");
            }else{
                System.out.println("Invalid entries.....Order not placed.... Please Order again.....");
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
