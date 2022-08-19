package day2_objects;

public class UseAirConditioner {
	public static void main(String[]args) {
		AirConditioner airConditioner1 = new AirConditioner();
		airConditioner1.airConditionerBrand = "LG";
		airConditioner1.airConditionerModel = 2014;
		airConditioner1.airConditionerColour = "Red";
		airConditioner1.airConditionerPrice = 6000;
		airConditioner1.airConditionerDiscountPercentage = 10;
		airConditioner1.airConditionerDiscountAmount = airConditioner1.airConditionerPrice*airConditioner1.airConditionerDiscountPercentage/100;
		airConditioner1.airConditionerNetPrice = airConditioner1.airConditionerPrice-airConditioner1.airConditionerDiscountAmount;
		AirConditioner airConditioner2 = new AirConditioner();
		airConditioner2.airConditionerBrand = "Samsung";
		airConditioner2.airConditionerModel = 2015;
		airConditioner2.airConditionerColour = "Black";
		airConditioner2.airConditionerPrice = 7000;
		airConditioner2.airConditionerDiscountPercentage = 20;
		airConditioner2.airConditionerDiscountAmount = airConditioner2.airConditionerPrice*airConditioner2.airConditionerDiscountPercentage/100;
		airConditioner2.airConditionerNetPrice = airConditioner2.airConditionerPrice-airConditioner2.airConditionerDiscountAmount;
		AirConditioner airConditioner3 = new AirConditioner();
		airConditioner3.airConditionerBrand = "Daikin";
		airConditioner3.airConditionerModel = 2016;
		airConditioner3.airConditionerColour = "Blue";
		airConditioner3.airConditionerPrice = 8000;
		airConditioner3.airConditionerDiscountPercentage = 30;
		airConditioner3.airConditionerDiscountAmount = airConditioner3.airConditionerPrice*airConditioner3.airConditionerDiscountPercentage/100;
		airConditioner3.airConditionerNetPrice = airConditioner2.airConditionerPrice-airConditioner2.airConditionerDiscountAmount;
		System.out.println("Airconditionerbrand="+airConditioner1.airConditionerBrand+" Airconditionernetprice="+airConditioner1.airConditionerNetPrice);
		System.out.println("Airconditionerbrand="+airConditioner2.airConditionerBrand+" Airconditionernetprice="+airConditioner2.airConditionerNetPrice);
		System.out.println("Airconditionerbrand="+airConditioner3.airConditionerBrand+" Airconditionernetprice="+airConditioner3.airConditionerNetPrice);
		
	}

}
