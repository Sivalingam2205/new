package day2_objects;

public class UseCar {
	public static void main(String[]args) {
		Car car1 = new Car();
		car1.carBrand = "Nisson";
		car1.carColour = "Red";
		car1.carPrice = 200000;
		car1.taxAmount = 20000;
		car1.isAirBag = true;
		car1.netPrice = car1.carPrice+car1.taxAmount;
		Car car2 = new Car();
		car2.carBrand = "BMW";
		car2.carColour = "Blue";
		car2.carPrice = 300000;
		car2.taxAmount = 30000;
		car2.isAirBag = true;
		car2.netPrice = car2.carPrice+car2.taxAmount;
		Car car3 = new Car();
		car3.carBrand = "Audi";
		car3.carColour = "Black";
		car3.carPrice = 400000;
		car3.taxAmount = 40000;
		car3.isAirBag = true;
		car3.netPrice = car3.carPrice+car3.taxAmount;
		System.out.println(car1.carBrand+" "+car1.netPrice);
		System.out.println(car2.carBrand+" "+car2.netPrice);
		System.out.println(car3.carBrand+" "+car3.netPrice);
		
		
		
	}

}
