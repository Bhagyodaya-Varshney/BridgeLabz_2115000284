public class HotelBooking{
	private String GuestName, RoomType;
	private int Nights;
	public HotelBooking(){
		this.GuestName = "Bhagyodaya";
		this.RoomType = "Luxry";
		this.Nights = 2;
	}
	public HotelBooking(String GuestName, String RoomType, int Nights){
		this.GuestName = GuestName;
		this.RoomType = RoomType;
		this.Nights = Nights;
	}
	public HotelBooking(HotelBooking Booking){
		this.GuestName = Booking.GuestName;
		this.RoomType = Booking.RoomType;
		this.Nights = Booking.Nights;
	}
	public String getGuestName(){
		return GuestName;
	}
	public String getRoomType(){
		return RoomType;
	}
	public int getNights(){
		return Nights;
	}
	public static void main(String[]args){
		HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Ayush", "Standard", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        
        System.out.println("Booking 1: Guest = " + booking1.getGuestName() + ", Room Type = " + booking1.getRoomType() + ", Nights = " + booking1.getNights());
        System.out.println("Booking 2: Guest = " + booking2.getGuestName() + ", Room Type = " + booking2.getRoomType() + ", Nights = " + booking2.getNights());
        System.out.println("Booking 3: Guest = " + booking3.getGuestName() + ", Room Type = " + booking3.getRoomType() + ", Nights = " + booking3.getNights());
	}
}