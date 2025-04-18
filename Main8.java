package codes;

class Vehicle1 {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle1(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency(double fuelConsumed, double distanceTraveled) {
        return distanceTraveled / fuelConsumed; // Fuel efficiency (miles per gallon or km per liter)
    }

    public double calculateDistanceTraveled(double fuelConsumed, double fuelEfficiency) {
        return fuelConsumed * fuelEfficiency; // Distance = Fuel consumed * Fuel efficiency
    }

    public double calculateMaxSpeed() {
        return 120.0; // Default maximum speed for generic vehicle (in km/h or mph)
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle1 {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateMaxSpeed() {
        return 100.0; // Trucks generally have a lower max speed
    }

    public void displayTruckDetails() {
        displayDetails();
        System.out.println("Maximum Speed: " + calculateMaxSpeed() + " km/h");
    }
}

class Car1 extends Vehicle1{
    public Car1(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateMaxSpeed() {
        return 200.0; // Cars typically have a higher max speed
    }

    public void displayCarDetails() {
        displayDetails();
        System.out.println("Maximum Speed: " + calculateMaxSpeed() + " km/h");
    }
}

class Motorcycle extends Vehicle1 {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateMaxSpeed() {
        return 180.0; // Motorcycles have moderate max speed
    }

    public void displayMotorcycleDetails() {
        displayDetails();
        System.out.println("Maximum Speed: " + calculateMaxSpeed() + " km/h");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Truck myTruck = new Truck("Ford", "F-150", 2022, "Diesel");
        Car1 myCar = new Car1("Toyota", "Camry", 2021, "Gasoline");
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020, "Gasoline");

        System.out.println("\nTruck Details:");
        myTruck.displayTruckDetails();
        System.out.println("Fuel Efficiency: " + myTruck.calculateFuelEfficiency(50, 600) + " km/l");

        System.out.println("\nCar Details:");
        myCar.displayCarDetails();
        System.out.println("Fuel Efficiency: " + myCar.calculateFuelEfficiency(40, 600) + " km/l");

        System.out.println("\nMotorcycle Details:");
        myMotorcycle.displayMotorcycleDetails();
        System.out.println("Fuel Efficiency: " + myMotorcycle.calculateFuelEfficiency(20, 500) + " km/l");
    }
}
