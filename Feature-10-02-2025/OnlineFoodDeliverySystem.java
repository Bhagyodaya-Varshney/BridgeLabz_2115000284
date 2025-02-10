import java.util.*;

class OnlineFoodDeliverySystem{
	public static void main(String[]args){
		List<FoodItems> orders = new ArrayList<>();
		FoodItems vegOrder = new VegItem("apple",100,4);
        FoodItems nonVegOrder = new NonVegItem("Chicken",100,4);
		
		orders.add(vegOrder);
		orders.add(nonVegOrder);
		
        for(FoodItems order : orders){
			order.getItemDetails();
			System.out.println("Total Price of Order: "+ order.calculateTotalPrice());
			System.out.println("Discount on Item: "+((Discountable)order).applyDiscount());
			System.out.println();
		}
	}
}
abstract class FoodItems{
    private String itemName;
    private int price;
    private int quantity;

    FoodItems(String itemName,int price,int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    abstract int calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Item Name: "+itemName);
        System.out.println("Price of Item: "+price);
        System.out.println("Quantity of Item: "+quantity);
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
class VegItem extends FoodItems implements Discountable{

	VegItem(String itemName,int price,int quantity){
		super(itemName,price,quantity);
	}
	@Override
	int calculateTotalPrice(){
		return (getPrice()*getQuantity());
	}
	@Override
	public double applyDiscount(){
		return calculateTotalPrice()*0.12;
	}
	@Override
    public String getDiscountDetails(){
		return "Veg Discount: 12%";
	}
}
class NonVegItem extends FoodItems implements Discountable{
	private static final int additional_Price = 100;
    NonVegItem(String itemName, int price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    int calculateTotalPrice(){
        return (getPrice()*getQuantity())+additional_Price;
    }
    @Override
    public double applyDiscount(){
        return calculateTotalPrice()*0.10;
    }
    @Override
    public String getDiscountDetails(){
        return "Non-Veg Discount: 10% off";
    }
}

interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}