package day2_objects;

public class UseShirt {
	public static void main(String[]args) {
		Shirt shirt1 = new Shirt();
		shirt1.shirtBrand = "VIP";
		shirt1.shirtSize = 'm';
		shirt1.shirtColour = "White";
		shirt1.shirtPrice = 555;
		shirt1.shirtTaxPercentage = 8;
		shirt1.shirtNetPrice = shirt1.shirtPrice+(shirt1.shirtPrice*shirt1.shirtTaxPercentage/100);
		System.out.println(shirt1.shirtBrand+" "+shirt1.shirtNetPrice);
		
		
		
	}

}
