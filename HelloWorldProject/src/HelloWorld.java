/*
 * TODO: Logan Torma-Kim
 * TODO: 9/17/2024
 * TODO: 3
 * TODO: A binary to decimal and decimal to binary converter
 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! You have the following options:");
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Decimal to Binary");
		System.out.println("Which type of conversion would you like to perform?");
		int choice = input.nextInt();
		input.nextLine();
		while (choice != 1 && choice != 2) {
			System.out.println("Which type of conversion would you like to perform?");
			choice = input.nextInt();
			input.nextLine();
		}
		String reverse = "";
		int decimalOut = 0;
		if (choice == 1) {
			System.out.println("What is the binary number?");
			String binary = input.nextLine();
			int count = 0;
			for (int x = binary.length()-1; x >= 0; x-- ) {
				reverse = reverse + binary.charAt(x);
				}
			for (int i=0; i < reverse.length(); i++) {
				if (reverse.charAt(i) == '1') {
					decimalOut+= Math.pow(2,count);
				}
				count++;
			}
			System.out.println("The decimal equivalent is: " + decimalOut);
		}
		String binaryOut = "";
		String rev="";
		if (choice == 2) {
			System.out.println("What is the decimal number?");
			int dec = input.nextInt();
			while (dec>0){
				binaryOut+=(dec%2);
				dec/=2;
			} //end while
			for(int l = binaryOut.length()-1; l>=0; l--) {
				rev = rev + binaryOut.charAt(l);
			}
			System.out.println(rev);
		}
		input.close();
	} // end main

} // end class
