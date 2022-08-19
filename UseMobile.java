package day2_objects;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mobile = new Mobile();
		mobile.mobileBrand = "OPPO";
		mobile.mobilePrice = 6000;
		mobile.isSmart = true;
		Mobile mobile1 = new Mobile();
		mobile1.mobileBrand = "Samsung";
		mobile1.mobilePrice = 7000;
		mobile1.isSmart = true;
        System.out.println("Brand="+mobile.mobileBrand);
        System.out.println("Price="+mobile.mobilePrice);
        System.out.println("isSmart="+mobile.isSmart);
        System.out.println("Brand="+mobile1.mobileBrand);
        System.out.println("Price="+mobile1.mobilePrice);
        System.out.println("isSmart="+mobile1.isSmart);
        
		
	}


}
