package Controller;

public class Product extends Item{
	
	private int ProductCode;

	public Product(String name, double price, int productCode) {
		super(name, price);
		ProductCode = productCode;
	}

	public int getProductCode() {
		return ProductCode;
	}

	@Override
	public String toString() {
		return "Product [ProductCode=" + ProductCode + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
    
	
	 
	
	
	
	

}
