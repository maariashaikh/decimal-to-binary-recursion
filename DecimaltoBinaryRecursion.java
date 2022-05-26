import java.util.Scanner;
import java.lang.Math;

public class DecimaltoBinaryRecursion {

    public static void main(String[] args) {
	  
		int num;
		Scanner scanner = new Scanner(System.in);
	   
		System.out.println("Welcome to Decimal to Binary Conversion Program! \"Please enter a decimal number:   \"");
		
		num = scanner.nextInt();
		
		System.out.println("Binary form : " + integerToBinary(num));
			 		
	 }// main

	
	private static String integerToBinary(int num) {
		String binaryNumber = "0";//base case
		if(num % 2 != 0) {
			binaryNumber = "1"; //update 
		}

		if (num > 1) {
			binaryNumber = integerToBinary(num / 2) + binaryNumber; //calling method
		}

		return binaryNumber;//return number in binary form 
                
	}

}

       