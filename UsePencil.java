package day2_objects;

public class UsePencil {
	public static void main(String[]args) {
		Pencil pencil1 = new Pencil();
		pencil1.pencilBrand = "Absara";
		pencil1.pencilPrice = 5;
		pencil1.pencilLedSize = 0.5f;
		pencil1.isLed = true;
		Pencil pencil2 = new Pencil();
		pencil2.pencilBrand = "Natraj";
		pencil2.pencilPrice = 6;
		pencil2.pencilLedSize = 0.6f;
		pencil2.isLed = true;
		System.out.println("Name="+pencil1.pencilBrand+" LedSize="+pencil1.pencilLedSize+" Price="+pencil1.pencilPrice);
		System.out.println("Name="+pencil2.pencilBrand+" LedSize="+pencil2.pencilLedSize+" Price="+pencil2.pencilPrice);
		
		
		
		
		
	}

}
