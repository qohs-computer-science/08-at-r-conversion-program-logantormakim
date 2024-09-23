/*
 * TODO: Logan Torma-Kim
 * TODO: 9/17/2024
 * TODO: 3
 * TODO: A binary to decimal and decimal to binary converter
 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// creates scanner
		Scanner input = new Scanner(System.in);

		// creates boolean and loop to determine whether to repeat
		boolean again = true;
		while (again) {
			// asks which conversion to perform
			System.out.println("Welcome! You have the following options:");
			System.out.println("1. Binary to Decimal");
			System.out.println("2. Decimal to Binary");
			System.out.println("Which type of conversion would you like to perform?");
			int choice = input.nextInt();
			input.nextLine();

			// loop until they answer conversion question 
			while (choice != 1 && choice != 2) {
				System.out.println("Which type of conversion would you like to perform?");
				choice = input.nextInt();
				input.nextLine();
			} // end question loop 

			// variables for conversion
			String reverse = "";
			int decimalOut = 0;
			// binary to decimal conversion
			if (choice == 1) {
				System.out.println("What is the binary number?");
				String binary = input.nextLine();
				int count = 0;
				for (int x = binary.length()-1; x >= 0; x-- ) {
					reverse = reverse + binary.charAt(x);
					} // end loop to reverse through binary
				for (int i=0; i < reverse.length(); i++) {
					if (reverse.charAt(i) == '1') {
						decimalOut+= Math.pow(2,count);
					}
					count++;
				} // end loop that counts and converts
				// prints out decimal
				System.out.println("The decimal equivalent is: " + decimalOut);
				// asks if we should continue 
				System.out.println("Do you want to continue - yes or no?");
				String yon = input.nextLine();
				if (yon.equals("no")) {
					again = false;
				} // ends if statement 
			} // end choice one loop

			// choice two start
			if (choice == 2) {
				String binaryOut = "";
				String rev="";
				System.out.println("What is the decimal number?");
				int dec = input.nextInt();
				input.nextLine();


				while (dec>0){
					binaryOut+=(dec%2);
					dec/=2;
				} //end while
				for(int l = binaryOut.length()-1; l>=0; l--) {
					rev = rev + binaryOut.charAt(l);
				} // end for to loop through string
				System.out.println(rev);
				System.out.println("Do you want to continue - yes or no?");
				String yon = input.nextLine();
				
				if (yon.equals("no")) {
					again = false;
				} // end if statement looping 
			}// end choice 2
		}// end while again 
		input.close();
	} // end main

} // end class
