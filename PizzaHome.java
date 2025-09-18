package PizzaShop;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PizzaHome {
    public static void main(String[] args) throws IOException {
        System.out.println("**Pizza Shop**");
        int choice;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Chosse from the following: ");
            System.out.println("1.Menu");
            System.out.println("2.Order");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("--------------------------------------------------------------------------------");
                    Pizzamenu ob = new Pizzamenu();
                    ob.pizza_menu();
                    System.out.println("--------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    Order od = new Order();
                    od.orderpizza();
                    System.out.println("--------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Thank You visit again!!!");
                    break;
            }
        }while(choice != 3);
    }
}
