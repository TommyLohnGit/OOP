import java.util.Vector;
//import java.util.Random;


public class Application {
	
	public static boolean getRandomBoolean() {
	       return Math.random() < 0.5;
	   }
	
	static String getRandomString(int n)
	 {
	 
	  // choose a Character random from this String
	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         + "0123456789"
	         + "abcdefghijklmnopqrstuvxyz";
	 
	  // create StringBuffer size of AlphaNumericString
	  StringBuilder sb = new StringBuilder(n);
	 
	  for (int i = 0; i < n; i++) {
	 
	   // generate a random number between
	   // 0 to AlphaNumericString variable length
	   int index
	    = (int)(AlphaNumericString.length()
	      * Math.random());
	 
	   // add Character one by one in end of sb
	   sb.append(AlphaNumericString
	      .charAt(index));
	  }
	 
	  return sb.toString();
	 }
	
	
	public static int getRandomInt() {
		
	       double number =  Math.random() * 1000;
	       return (int) Math.round(number);
	   }
	
	public static double getRandomDouble() {
	       return (double) Math.random() * 100;
	   }

	public static void main(String[] args) {
		System.out.println("application started");
		
		
//		Product p = new Product();
//		p.name = "TV";
//		p.availability = true;
//		p.referencenumber = 123456;
//		p.price = 2000;
//		
//		Product p2 = new Product();
//		p2.name = "Laptop";
//				
//		p.printInformation();
		
		int NumberOfProducts = 10;
		
		Vector<Product> ProductList = new Vector<Product>();
		
		
		for (int i = 1; i <= NumberOfProducts ; i++) {
			
			Product product = new Product();
			
			product.setName(getRandomString(10));
			product.setReferenceNumber(getRandomInt());
			product.setAvailability(getRandomBoolean());
			product.setPrice(getRandomDouble());
			
			ProductList.add(product);
			}
		
		System.out.println("||Name||Number||Available||Price||Brand||Weigth||Payload||");
		for (Product i : ProductList) {
            //i.printInformation();
        }
		
		
		Car car1 = new Car();
		Scooter scooter1 = new Scooter();
		
		
		car1.name = "Golf";
		scooter1.name = "Sprint";
		
		car1.referencenumber = 1234;
		scooter1.referencenumber = 5678;
		
		car1.availability = true;
		scooter1.availability = false;
		
		car1.price = 10000;
		scooter1.price = 3000;
		
		car1.brand = "Volkswagen";
		scooter1.brand = "Vespa";
		
		car1.weigth = 1900;
		scooter1.weigth = 110;
		
		car1.payload = 900;
		scooter1.payload = 150;
		
		
		car1.printInformation();
		
		car1.startVehicle();
		
		car1.getType();
		
		
	}

}
