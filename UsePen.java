package day2_objects;

public class UsePen {
	public static void main(String[]args) {
		Pen pen1 = new Pen();
		pen1.brand = "Parker";
		pen1.price = 5;
		pen1.isBlueColour = true;
		pen1.tipWidth = 0.5f;
		Pen pen2 = new Pen();
		pen2.brand = "Reynold";
		pen2.price = 10;
		pen2.isBlueColour = true;
		pen2.tipWidth = 0.7f;
		Pen pen3 = new Pen();
		pen3.brand = "Flair";
		pen3.price = 15;
		pen3.isBlueColour = true;
		pen3.tipWidth = 0.5f;
		System.out.println("Brand="+pen1.brand+" Price="+pen1.price+" IsBlueColour="+pen1.isBlueColour+" Tipwidth="+pen1.tipWidth);
		System.out.println("Brand="+pen2.brand+" Price="+pen2.price+" IsBlueColour="+pen2.isBlueColour+" Tipwidth="+pen2.tipWidth);
		System.out.println("Brand="+pen3.brand+" Price="+pen3.price+" IsBlueColour="+pen3.isBlueColour+" Tipwidth="+pen3.tipWidth);
		
	}

}
