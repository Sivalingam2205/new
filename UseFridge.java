package day2_objects;

public class UseFridge {
	public static void main(String[]args) {
		Fridge fridge1 = new Fridge();
		fridge1.fridgeBrand = "LG";
		fridge1.fridgeModel = 2014;
		fridge1.fridgeColour = "Red";
		fridge1.fridgeIsQuality = true;
		fridge1.fridgePrice = 12000;
		fridge1.fridgeTaxPercentage = 10;
		fridge1.fridgeDiscountPercentage = 20;
		fridge1.fridgeTaxAmount = fridge1.fridgePrice*fridge1.fridgeTaxPercentage/100;
		fridge1.fridgeDiscountAmount = fridge1.fridgePrice*fridge1.fridgeDiscountPercentage/100;
		fridge1.fridgeNetPrice = fridge1.fridgePrice+fridge1.fridgeTaxAmount-fridge1.fridgeDiscountAmount;
		System.out.println("Fridgeprice="+fridge1.fridgePrice+" Fridgenetprice="+fridge1.fridgeNetPrice);
		
		
	}

}
