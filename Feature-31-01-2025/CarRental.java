public class CarRental{
	private String CustomerName,CarModel;
	private int RentalDays;
	private double RentalRate;
	
	public CarRental(String CustomerName,String CarModel, int RentalDays, double RentalRate){
		this.CustomerName = CustomerName;
		this.CarModel = CarModel;
		this.RentalDays = RentalDays;
		this.RentalRate = RentalRate;
	}
	public double TotalCost(){
		return RentalDays * RentalRate;
	}
	public static void main(String[]args){
		CarRental car1 = new CarRental("Bhagyodaya","XUV 700",7,20.0);
		System.out.println("Your Rent would we:"+car1.TotalCost());
	}
}