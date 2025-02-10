import java.util.*;

public class RideHailingApplication {
    public static void main(String[] args) {
        List<GPS> vehicles = new ArrayList<>();
        vehicles.add(new Car("Anuj", 1005, 10, "Mathura"));
        vehicles.add(new Bike("Ayush", 1010, 20, "Agra"));
        vehicles.add(new Auto("Kunal", 1001, 15, "Mathura"));

        for (GPS vehicle : vehicles) {
            Vehicle v = (Vehicle) vehicle;
            v.getVehicleDetails();
            System.out.println("Current Location: " + vehicle.getCurrentLocation());
            System.out.println("Fare for " + 10 + " km: " + v.calculateFare(10) + " Rs.");
            vehicle.updateLocation("New Destination");
            System.out.println("Updated Location: " + vehicle.getCurrentLocation());
            System.out.println();
        }
    }
}

abstract class Vehicle {
    private String driverName;
    private int vehicleId, ratePerKm;

    public Vehicle(String driverName, int vehicleId, int ratePerKm) {
        this.driverName = driverName;
        this.vehicleId = vehicleId;
        this.ratePerKm = ratePerKm;
    }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver Name: " + driverName);
        System.out.println("Vehicle Id: " + vehicleId);
        System.out.println("Rate Per KM: " + ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String driverName, int vehicleId, int ratePerKm, String location) {
        super(driverName, vehicleId, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * 50;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String driverName, int vehicleId, int ratePerKm, String location) {
        super(driverName, vehicleId, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * 20;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String driverName, int vehicleId, int ratePerKm, String location) {
        super(driverName, vehicleId, ratePerKm);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * 15;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

