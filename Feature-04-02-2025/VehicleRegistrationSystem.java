class VehicleRegistrationSystem{
	public static void main(String[]args){
		Vehicle vehicle1 = new Vehicle("Bhagyodaya","Car",100101);
		Vehicle vehicle2 = new Vehicle("Ayush","Bike",100102);
		
		vehicle1.displayDetails(vehicle1);
		vehicle2.displayDetails(vehicle2);
		
		vehicle1.updateRegistrationFee(1200);
		
		vehicle1.displayDetails(vehicle1);
	}
}
class Vehicle{
	private static int registrationFee = 1000;
	private String ownerName, vehicleType;
	private final int registrationNumber;

	
	Vehicle(String ownerName, String vehicleType, int registrationNumber){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}
	public void displayDetails(Vehicle vehicle){
		if(vehicle instanceof Vehicle){
			System.out.println("Owner Name: " + ownerName);
			System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
		}
	}
	public void updateRegistrationFee(int newRegistrationFee){
		registrationFee = newRegistrationFee;
	}
}