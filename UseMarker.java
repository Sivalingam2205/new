package day2_objects;

public class UseMarker {
public static void main(String[]args) {
	Marker marker = new Marker();
	marker.brand = "camlin";
	marker.price = 50;
	marker.colour = "Red";
	marker.isRefillable = true;
System.out.println(marker.brand+" "+marker.price+" "+marker.colour+" "+marker.isRefillable);


}

}
