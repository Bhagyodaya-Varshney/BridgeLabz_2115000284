class VehicleManagementSystem{
	public static void main(String[]args){
		ElectricVehicle ev = new ElectricVehicle("MG Comet", 300, 50);
        PetrolVehicle pv = new PetrolVehicle("Alto 800", 150, 10);

        ev.displayInfo();
        ev.charge();

        pv.displayInfo();
        pv.refuel();
	}
}
class Vehicle {
    private String model;
    private int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
	public String getModel(){
		return model;
	}
}
interface Refuelable {
    void refuel();
}
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(getModel() + " is charging. Battery capacity: " + batteryCapacity + " kWh");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Electric Vehicle, Battery Capacity: " + batteryCapacity + " kWh");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel() {
        System.out.println(getModel() + " is refueling. Fuel capacity: " + fuelCapacity + " liters");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol Vehicle, Fuel Capacity: " + fuelCapacity + " liters");
    }
}