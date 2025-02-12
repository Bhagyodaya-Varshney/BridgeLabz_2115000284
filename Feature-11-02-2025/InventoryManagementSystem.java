class InventoryManagementSystem{
    public static void main(String[] args) {
        Item item = new Item(100101,"T-Shirts",20,2000);
		item = item.addItemAtBegining(100108,"Joggers",10,1500,item);
		item = item.addItemAtBegining(100110,"Formal Pants",15,2500,item);
		item = item.addItemAtEnd(100100,"Cargos",25,1000,item);

        item.displayTotalValueOfInventory(item);
		
		item.updateItemQuantity(100108,item,20);
		item.displayTotalValueOfInventory(item);
		
		item.searchItem(100100,item);
		
		item = item.sortTheInventory(item);
		System.out.println("Sorted Product List: ");
		item.displayProduct(item);

    }
}

class Item{
    int ItemId, Quantity,Price;
    String ItemName;
    Item next;

    Item(int ItemId, String ItemName, int Quantity, int Price) {
        this.ItemId = ItemId;
        this.ItemName = ItemName;
        this.Quantity = Quantity;
		this.Price = Price;
        this.next = null;
    }

    public static Item addItemAtBegining(int ItemId, String ItemName, int Quantity, int Price, Item item) {
        Item newItem = new Item(ItemId,ItemName, Quantity, Price);
        newItem.next = item;
        return newItem;
    }

    public static Item addItemAtEnd(int ItemId, String ItemName, int Quantity, int Price, Item item) {
        Item newItem = new Item(ItemId,ItemName, Quantity, Price);

        if (item == null) 
            return newItem;

        Item tempItem = item;
        while (tempItem.next != null)
            tempItem = tempItem.next;

        tempItem.next = newItem;
        return item;
    }

    public static void searchItem(int ItemId, Item item) {
        while (item != null && item.ItemId != ItemId)
            item = item.next;

        if (item == null) {
            System.out.println("Item with ItemId " + ItemId + " not found.");
            return;
        }

        System.out.println("Item Name: " + item.ItemName);
        System.out.println("Item Id: " + item.ItemId);
        System.out.println("Item Quantity: " + item.Quantity);
        System.out.println("Item Price: " + item.Price);
        System.out.println();
    }

    public static void updateItemQuantity(int ItemId, Item item, int Quantity) {
        while (item != null && item.ItemId != ItemId)
            item = item.next;

        if (item == null) {
            System.out.println("Item with Item Id " + ItemId + " not found.");
            return;
        }

        item.Quantity = Quantity;
        System.out.println("Item Quantity Updated.");
        System.out.println();
    }
	public static Item sortTheInventory(Item item){
		if(item == null || item.next == null)	return item;
		
		Item middle = findMiddle(item);
		Item nextToMiddle = middle.next;
		middle.next = null;
		
		Item left = sortTheInventory(item);
		Item right = sortTheInventory(nextToMiddle);
		
		return merge(left,right);
	}
	public static Item findMiddle(Item item){
		if(item == null) return item;
		Item slow = item,fast = item;
		
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	public static Item merge(Item left, Item right){
		if(left == null)	return right;
		if(right == null)	return left;
		
		Item res;
        if (left.Price <= right.Price) {
            res = left;
            res.next = merge(left.next, right);
        } else {
            res = right;
            res.next = merge(left, right.next);
        }
        return res;
	}
    public static void displayTotalValueOfInventory(Item item) {
        int sum = 0;
		while (item != null) {
			int price = item.Price;
			int quantity = item.Quantity;
			sum += (price*quantity);
            item = item.next;
        }
        System.out.print("Total Value of Inventory is: "+sum);
		System.out.println();
    }
	public static void displayProduct(Item item) {
        while (item != null) {
            System.out.print(item.Price + " -> ");
            item = item.next;
        }
        System.out.println("null");
    }
}
