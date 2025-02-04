class ShoppingCartSystem{
	public static void main(String[]args){
		Product product1 = new Product("Laptop",2,50000,501);
		Product product2 = new Product("SmartPhone",10,20000,502);
		
		product1.displayDetails(product1);
		product2.displayDetails(product2);
		
		Product.updateDiscount(20);
		
		product1.displayDetails(product1);
		product2.displayDetails(product2);
	}
}
class Product{
	private static int discount=10;
	private String productName;
	private int price, quantity;
	private final int productId;
	
	Product(String productName, int quantity, int price, int productId){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productId = productId;
	}
	public void displayDetails(Product product){
		if(product instanceof Product){
			System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productId);
            System.out.println("Discount: " + discount + "%");
		}
	}
	public static void updateDiscount(int newDiscount){
		discount = newDiscount;
	}
}