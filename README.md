# Toyota Dealership Application

A Java console application that allows users to manage a dealership inventory system.  
Users can search, add, remove, and display vehicles stored inside an inventory CSV file.

---

## Features

- Find vehicles by:
  - Price range
  - Make and model
  - Year range
  - Color
  - Mileage
  - Vehicle type

- Display all vehicles
- Add a vehicle
- Remove a vehicle
- Save dealership inventory to a CSV file

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- File I/O
- BufferedReader
- BufferedWriter

---

## Project Structure

```text
src
│
├── main
│   ├── java
│   │   └── com.pluralsight
│   │       ├── ToyotaApp.java
│   │       ├── UserInterface.java
│   │       ├── Dealership.java
│   │       ├── DealershipFileManager.java
│   │       └── Vehicle.java
│   │
│   └── resources
│       └── inventory.csv
```

---

## Classes

### Vehicle
Represents a vehicle in the dealership inventory.

Fields include:
- VIN
- Year
- Make
- Model
- Vehicle Type
- Color
- Odometer
- Price

---

### Dealership
Stores dealership information and manages the inventory list.

Methods include:
- addVehicle()
- remove()
- getVehiclesByPrice()
- getVehiclesByMakeModel()
- getVehiclesByColor()
- getVehiclesByMileage()
- getVehicleByType()
- getAllVehicles()

---

### DealershipFileManager
Handles reading and writing dealership data to the `inventory.csv` file.

Responsibilities:
- Load dealership data
- Save dealership inventory
- Parse CSV data

---

### UserInterface
Handles user interaction through the console menu system.

Users can:
- Search inventory
- Add vehicles
- Remove vehicles
- View all vehicles

---

### ToyotaApp
Main application entry point.

Starts the program and launches the user interface.

---

## How to Run

1. Open the project in IntelliJ IDEA or another Java IDE.
2. Make sure the `inventory.csv` file exists inside:

```text
src/main/resources/
```

3. Run:

```java
ToyotaApp.java
```

---

## Example Menu

```text
************************************************
        WELCOME TO TOYOTA DEALERSHIP
************************************************

1 - Find vehicles within a price range
2 - Find vehicles by make / model
3 - Find vehicles by year range
4 - Find vehicles by color
5 - Find vehicles by mileage range
6 - Find vehicles by type
7 - List ALL vehicles
8 - Add a vehicle
9 - Remove a vehicle
99 - Quit
```

---

## Example Vehicle Format

```text
10112 | 2022 | Toyota | SUV | Black | 12000 | $32000.0
```

---

## Future Improvements

- Fix vehicle removal by VIN
- Improve input validation
- Prevent duplicate VIN numbers
- Add vehicle sorting
- Add dealership reports
- Improve menu formatting

---

## Author

Created as a Java learning project.
Lovi Tesfay
