import java.util.Scanner;

public class arrayOutput {
   public static void main (String [] args) {

	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("This is the seating chart: ");
	   
	   int [][] seatingChart = { 
			   {10,10,10,10,10,10,10,10,10,10},
			   {10,10,10,10,10,10,10,10,10,10},
			   {10,10,10,10,10,10,10,10,10,10},
			   {10,10,10,10,10,10,10,10,10,10},
			   {10,10,20,20,20,20,20,20,10,10},
			   {10,10,20,20,20,20,20,20,10,10},
			   {10,10,20,20,20,20,20,20,10,10},
			   {10,10,50,50,50,50,50,50,10,10},
			   {20,20,50,50,50,50,50,50,20,20},
			   {30,40,50,50,50,50,50,50,40,30},
	   };
	   
	   for (int row = 0; row < seatingChart.length; row++) {
			  
			  for (int col = 0; col < seatingChart[row].length; col++) {
				  
				  System.out.print(seatingChart[row][col] + " ");
				  
			  }
			  System.out.println();
	   }
	   
	   int seatPrice = 0;
	   int seatNum = 0;
	   int seatRow = 0;
	   
	   System.out.print("\n" + "Pick by Seat or Price to purchase a ticket (S or P): ");
	   
	   String purchaseSeat = sc.next();
	   
	   if (purchaseSeat.equalsIgnoreCase("s")||purchaseSeat.equalsIgnoreCase("p")) {
		   
		   if (purchaseSeat.equalsIgnoreCase("p")) {
			   System.out.print("Enter the price for the seat: ");
			   seatPrice = sc.nextInt();
			   //insert a search for a seat with this price
			   System.out.println("Price: " + seatPrice);
			   System.out.println("Seat Purchased!");
		   
		   } else if (purchaseSeat.equalsIgnoreCase("s")) {
			   System.out.print("Enter the row of the seat: ");
			   seatRow = sc.nextInt()-1;
			   System.out.println("Seat Row: " + (seatRow+1));
		   
			   System.out.print("Enter the seat # of the seat (1-10): ");
			   seatNum = sc.nextInt()-1;
			   System.out.println("Seat #: " + (seatNum+1));
			   
			   System.out.println ("\n" + "The price is " + seatingChart[seatRow][seatNum] + "\n");
		   } 
		   if (seatRow < 0 && seatRow > 10 || seatNum < 0 && seatNum > 10) {
			   System.out.println("Invalid input. Enter 1 to 10 ");
			   System.exit(0);
		   }
		   
	   } else if (!purchaseSeat.equalsIgnoreCase("s")||!purchaseSeat.equalsIgnoreCase("p")){
		   System.out.println("Invalid input. Enter S or P ");
		   System.exit(0);
	   }
	   
	   
	   
		   System.out.println("");
		   
		   System.out.println("This is the seating chart: ");
		   
		   if (seatingChart[seatRow][seatNum] == seatPrice) {
			   //seatingChart[seatRow][seatNum] = 0;
			   System.out.println("hello");
		   }
		   
		   for (int row = 0; row < seatingChart.length; row++) {
				  
				  for (int col = 0; col < seatingChart[row].length; col++) {
					  
					  System.out.print(seatingChart[row][col] + " ");
					  
				  }
				  System.out.println(); 
		   }
	System.exit(0);   
   }
}   

