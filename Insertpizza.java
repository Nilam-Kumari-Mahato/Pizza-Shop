package PizzaShop;
import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class Insertpizza {
    public static void main(String[] args) throws IOException{
        Scanner in= new Scanner(System.in);

        System.out.println("**Enter the pizza details**");
        System.out.println("Enter PizzaNo: ");
        String pno= in.next() ;

        System.out.println("Enter PizzaName: ");
        String pname= in.next();

        System.out.println("Enter size: ");
        String size= in.next();

        System.out.println("Enter price: ");
        int price= in.nextInt();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" , "system" , "manager"); //type 4 driver's other name is thin
            Statement stmt=con.createStatement();
            String q1= "insert into pizzamenu values ('"+pno+"' , '"+pname+"' , '"+size+"' , '"+price+"')";
            int x= stmt.executeUpdate(q1);
            if(x>0){
                System.out.println("Insert Success");
            }
            else{
                System.out.println("Insert unSuccess");
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
