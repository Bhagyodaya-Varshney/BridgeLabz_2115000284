public class Product{
	private String productName;
	private int price;
	private static int totalProducts = 0;
	public Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	public void displayProductDetails(){
		System.out.println("Product Name:"+productName);
		System.out.println("Product Price:"+price);
	}
	public static void displayTotalProducts(){
		System.out.println("Total Products are: "+totalProducts);
	}
	public static void main(String[]args){
		Product product1 = new Product("SmartPhone",15000);
		Product product2 = new Product("Smart T.V",25000);
		
		product1.displayProductDetails();
		product2.displayProductDetails();
		
		Product.displayTotalProducts();
	}
}