import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		String [] things = new String[6];
		
		things [0] = "vroom";
		things [1] = "vroom";
		things [2] = "i";
		things [3] = "am";
		things [4] = "speed";
		things [5] = "wow";
		
		ArrayList <String> cities = new ArrayList <> ();
		
		cities.add("KILL");
		cities.add("THIS");
		cities.add("LOVE");
		cities.add("SAD");
		cities.add("BUT");
		cities.add("TRUE");
		
		for (int i = 0; i < 6; i++) {
			System.out.println(things[i]);
			System.out.println(cities.get(i));
			//System.out.println(cities);
		}
		
		//Enhanced For-Loop
		//for (type name : List) {
			//things to do;
		//}
		
		System.out.println("\nEnhanced For-Loop:");
		for (String town : cities) {
			System.out.println(town);
		}

		ArrayList <Integer> swag = new ArrayList <> ();
		
		swag.add(1);
		swag.add(3);
		swag.add(1, 69); //originally 1, 3, 69
						//now 69 put into index 1
		
		System.out.println("\nWrapper Integer:");
		for (Integer swagSecond : swag) {
			System.out.println(swagSecond);
		}
		
		
	}

}
