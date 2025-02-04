package Controller;

public class Service extends Item{
	
	private int ServiceCode; 
	private String ServiceCategory;
	
	public Service(String name, double price, int serviceCode, String serviceCategory) {
		super(name, price);
		ServiceCode = serviceCode;
		ServiceCategory = serviceCategory;
	}

	public int getServiceCode() {
		return ServiceCode;
	}


	public String getServiceCategory() {
		return ServiceCategory;
	}

	@Override
	public String toString() {
		return "Service [ServiceCode=" + ServiceCode + ", ServiceCategory=" + ServiceCategory + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
   
	
}
