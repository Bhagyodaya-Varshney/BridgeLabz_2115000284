import java.util.*;

class SmartWarehouseManagementSystem{
	public static void main(String[]args){
		Storage<Electronics> ele = new Storage<>();
		ele.addItems(new Electronics("Laptop"));
		ele.addItems(new Electronics("Television"));
		ele.addItems(new Electronics("SmartPhone"));
		Storage.displayItems(ele.getItems());
		System.out.println();
		Storage<Groceries> gro = new Storage<>();
		gro.addItems(new Groceries("Biscuts"));
		gro.addItems(new Groceries("Namkeen"));
		gro.addItems(new Groceries("Snacks"));
		Storage.displayItems(gro.getItems());
		System.out.println();
		Storage<Furniture> fur = new Storage<>();
		fur.addItems(new Furniture("Chair"));
		fur.addItems(new Furniture("Sofa"));
		fur.addItems(new Furniture("Bed"));
		Storage.displayItems(fur.getItems());
	}
}
abstract class WarehouseItem{
	private String itemName;
	WarehouseItem(String itemName){
		this.itemName = itemName;
	}
	public String getItemName(){
		return itemName;
	}
}
class Electronics extends WarehouseItem{
	Electronics(String itemName){
		super(itemName);
	}
}
class Groceries extends WarehouseItem{
	Groceries(String itemName){
		super(itemName);
	}
}
class Furniture extends WarehouseItem{
	Furniture(String itemName){
		super(itemName);
	}
}

class Storage<T extends WarehouseItem>{
	private List<T> itemsList = new ArrayList<>();
	void addItems(T item){
		itemsList.add(item);
	}
	List<T> getItems(){
		return itemsList;
	}
	public static void displayItems(List<? extends WarehouseItem> list ){
		for(WarehouseItem item : list)
			System.out.println("Item Name: "+item.getItemName());
	}
}