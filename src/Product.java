
public class Product {
	
	protected String name;
	protected int referencenumber;
	protected boolean availability;
	protected double price;
	
	
	public String getName() {
		return this.name;
	}
	
	public int getReferenceNumber() {
		return this.referencenumber;
	}
	
	public boolean getAvailability() {
		return this.availability;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setReferenceNumber(int string) {
		this.referencenumber = string;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printInformation() {
		
		String CurrentName = getName();
		int CurrentReferenceNumber = getReferenceNumber();
		boolean CurrentAvailability = getAvailability();
		double CurrentPrice = getPrice();
	
		System.out.println("||" + CurrentName + "||" + CurrentReferenceNumber + "||" + CurrentAvailability + "||" + CurrentPrice);
		
	}

}
