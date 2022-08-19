package day2_objects;

public class UseBike {
	public static void main(String[]args) {
		Bike bike1 = new Bike();
		bike1.bikeBrand = "Bajaj";
		bike1.bikeColour = "Red";
		bike1.bikeDiscountAmount = 2000;
		bike1.bikePrice = 60000;
		bike1.isTubeless = true;
		bike1.bikeNetPrice = bike1.bikePrice-bike1.bikeDiscountAmount;
		Bike bike2 = new Bike();
		bike2.bikeBrand = "TVS";
		bike2.bikeColour = "Black";
		bike2.bikeDiscountAmount = 5000;
		bike2.bikePrice = 80000;
		bike2.isTubeless = true;
		bike2.bikeNetPrice = bike2.bikePrice-bike2.bikeDiscountAmount;
		System.out.println(bike1.bikeBrand+" "+bike1.bikeNetPrice);
		System.out.println(bike2.bikeBrand+" "+bike2.bikeNetPrice);
		
		
	}
		

}
