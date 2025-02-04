package Controller;

public class Item {
	
	private  String Name;
	private double price;
	
	public Item(String name, double price) {
		super();
		Name = name;
		this.price = price;
	}

	public String getName() {
		return Name;
	}


	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [Name=" + Name + ", price=" + price + "]";
	}

	
	
   
}
