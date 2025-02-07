class VehicleAndTransportationSystem{
	public static void main(String[]args){
		Vehicle[] vehicles = {
            new Car(200, "Petrol", 5),
            new Truck(120, "Diesel", 10),
            new Motorcycle(180, "Petrol", false)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
	}
}
class Vehicle {
    private int maxSpeed;
    private String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " mt/min, Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle {
    private int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car, Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck, Load Capacity: " + loadCapacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    private boolean Sidecar;

    Motorcycle(int maxSpeed, String fuelType, boolean Sidecar) {
        super(maxSpeed, fuelType);
        this.Sidecar = Sidecar;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle, Sidecar: " + (Sidecar ? "Yes" : "No"));
    }
}