
public abstract class Vehicle extends Product{

	protected String brand;
	protected double weigth;
	protected double payload;
	
	
	public String getBrand () {
		return this.brand;
	}
	
	public double getWeigth () {
		return this.weigth;
	}
	
	public double getPayload () {
		return this.payload;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public void setPayload(double payload) {
		this.payload = payload;
	}

	public abstract void startVehicle(); 
	
	public abstract void getType();
		

	
	public void printInformation() {
		
		String CurrentName = super.getName();
		int CurrentReferenceNumber = super.getReferenceNumber();
		boolean CurrentAvailability = super.getAvailability();
		double CurrentPrice = super.getPrice();
		
		String CurrentBrand = getBrand();
		double CurrentWeigth = getWeigth();
		double CurrentPayload = getPayload();
	
		System.out.println("||" + CurrentName + "||" + CurrentReferenceNumber + "||" 
		+ CurrentAvailability + "||" + CurrentPrice + "||" + CurrentBrand + "||" + CurrentWeigth + "||" + CurrentPayload + "||" );
		
	}
	
	
}









