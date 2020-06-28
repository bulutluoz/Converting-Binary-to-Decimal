package git_binary_to_decimal;

import java.util.Scanner;

public class BinaryToDecimal {
		
	public static void main(String[] args) {
		// Takes a binary number from user and transform it to decimal number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a binary number");
		int binaryNum= scan.nextInt(); // we accept it as decimal to find every single number Eg.
		
		int digit=0;
		double decimalNum=0;
		int count=0;
		boolean isBinary=true;
		
		
		// to get every single number of binaryNum we use % operator
		// as decimal "binaryNum%10" gives us last digit
		// switch case checks the digit if it is binary or not, if it finds any digit which not equal 0 or 1
		// prints"It is not a binary number"
		// 
		while(binaryNum>0) {  
			
			if(binaryNum==1) {          // "if condition" checks if the number 1 digit or more than 1 digit
				digit=1;				// if the number has just 1 digit condition get it 
			}else digit=binaryNum%10;	// if the number has more than 1 digit condition uses %
			
			switch(digit) {
			
			case 1:
				decimalNum=decimalNum+digit* Math.pow(2, count);
				count++;
				binaryNum=binaryNum/10;
				break;
			case 0:
				count++;
				binaryNum=binaryNum/10;
				break;
			default:
				System.out.println("It is not a binary number");
				isBinary=false;	// it is a flag for number which is not binary
				binaryNum=0;
			}
		
			
		}
		
		// we calculated the decimal value. If the binaryNum is binary we will print value
		if (isBinary) {
			int result=(int) decimalNum;
			System.out.println(result);	
		}
				scan.close();
	}
	

}
