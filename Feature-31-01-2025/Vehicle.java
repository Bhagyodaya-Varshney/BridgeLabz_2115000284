public class Vehicle{
	private String ownerName, vehicleType;
	private static int registrationFee;
	public Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	public void displayVehicleDetails(){
		System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee+"Rs.");
	}
	public static void updateRegistrationFee(int newRegistrationFee){
		registrationFee  = newRegistrationFee;
	}
	public static void main(String[]args){
		Vehicle.updateRegistrationFee(1000);
		Vehicle vehicle = new Vehicle("Bhagyodaya","Activa");
		vehicle.displayVehicleDetails();
	}
}