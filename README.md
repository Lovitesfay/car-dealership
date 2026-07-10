# Toyota Dealership Application

## Overview

This Java console application allows a dealership to manage vehicle inventory, search for vehicles, add and remove vehicles, and process vehicle sales and leases.

The program reads vehicle inventory data from a CSV file and allows the user to interact with the dealership using a menu-driven interface.

---

# 🚗 Start the Engine

Ready to manage the dealership? 🔑

## 🏁 Run the Application

1. Clone the repository.
2. Open the project in **IntelliJ IDEA**.
3. Make sure **Java** and **Maven** are installed.
4. Run the `ToyotaApp` class.
5. Use the console menu to search vehicles, manage inventory, and process sales or leases.

## 🚘 Take It for a Test Drive

Search Inventory → Find a Vehicle → Sell or Lease → Generate Contract → Save Data

**You're ready to run the dealership! 🚗💨**

---

# Features

## Vehicle Search Options

Users can search the dealership inventory by:

- Price range
- Make and model
- Year range
- Color
- Mileage
- Vehicle type

---

# Inventory Management

The application also allows users to:

- View all vehicles
- Add a new vehicle
- Remove a vehicle

Inventory changes are saved back into:

```text
inventory.csv
```

---

# Sales and Leasing

Users can sell or lease a vehicle directly from the dealership inventory.

## Sales Contracts

Sales contracts calculate:

- Sales tax
- Recording fee
- Processing fee
- Total price
- Monthly payment

## Lease Contracts

Lease contracts calculate:

- Expected ending value
- Lease fee
- Total price
- Monthly payment

Lease information is saved into:

```text
contracts.csv
```

---

# Classes Used

```text
ToyotaApp
UserInterface
Dealership
Vehicle
DealershipFileManager
Contract
SalesContract
LeaseContract
ContractFileManager
```

---

# Technologies Used

- Java
- Object-Oriented Programming
- ArrayLists
- File Handling
- Inheritance
- Exception Handling

---

# Example Menu

```text
1 - Find vehicles within a price range
2 - Find vehicles by make / model
3 - Find vehicles by year range
4 - Find vehicles by color
5 - Find vehicles by mileage range
6 - Find vehicles by type
7 - List ALL vehicles
8 - Add a vehicle
9 - Remove a vehicle
10 - Sell / Lease a vehicle
99 - Quit
```

---

# Example Contract Output

```text
20260519|John Smith|10112|2019|Toyota|Camry
20260519|Sarah Lee|37846|2023|Honda|Civic
```

---

# Author

Lovi Tesfay
