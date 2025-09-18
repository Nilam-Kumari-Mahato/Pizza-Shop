# 🍕 Pizza Shop Management System (Java + Oracle SQL)

A simple **Pizza Shop Management System** built using **Java** and **Oracle RDBMS (SQL)**.  
This project demonstrates **menu-driven programming in Java** with database connectivity using **JDBC**.

---

## ✨ Features
- Insert new pizza details into the menu (via Oracle DB).
- View the available pizza menu.
- Place an order (store order details in DB).
- Generate and display the final bill.
- Exit option with a thank you message.

---

## 🛠️ Tech Stack
- **Java** (Core Java, JDBC)
- **Oracle RDBMS** (SQL queries for menu, orders, and billing)
- **GitHub** (version control & hosting)

---

## 📂 Project Structure
PizzaShop/
│
├── src/
│ ├── PizzaHome.java # Main driver class with switch-case menu
│ ├── InsertPizza.java # Insert pizza details into DB
│ ├── ViewMenu.java # View pizza menu
│ ├── OrderPizza.java # Take order from customer
│ ├── Bill.java # Generate final bill
│
└── README.md # Documentation

---

## 🚀 How It Works
1. Run `PizzaHome.java`  
2. Choose an option from the menu:  
   - `1` → View Pizza Menu  
   - `2` → Place Order  
   - `3` → Generate Bill  
   - `4` → Exit  
3. The program loops until you exit.

---

