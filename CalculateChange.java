package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.*;

public class CalculateChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number ");
		//scanning the input
		int cents =0;
		Scanner sc = new Scanner(System.in);
		try{
		        cents = sc.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Print a valid integer number");
			System.exit(1);
		}
		sc.close();
		if(cents < 0){
			//money or cents cannot be a negative number hence exiting
			System.out.println("Enter a positive number");
			System.exit(1);
		}
		
		//Final ans stored in result where result(0) = number of quarters, result(1) = number of dimes and so on
		List<Integer> result = calculateChange(cents);
		
		//Test block
		/*for(int ans : result){
			System.out.println(ans);
		}*/
	}
		
	//Function to calculate the change
	/*
	 * params
	 * cents - amount of money in cents
	 */
	public static List<Integer> calculateChange(int cents){
		
			//Grouping change denominations as an array
			int[] changeDenomination = {25, 10, 5, 1};
			List<Integer> result = new ArrayList<>();
			//Using greedy algorithm to have maximum number of higher denomination coins
			for(int i = 0; i<changeDenomination.length; i++){
				//the quotient would be the maximum number of coins for each denomination
				result.add(cents/changeDenomination[i]);
				//Remaining cents
				cents = cents % changeDenomination[i];
			}
			//Pretty printing the result
			System.out.println(result.get(0) + " quarters, " + result.get(1) + " dimes, " + result.get(2) + " nickels, " + result.get(3) + " pennies.");
			return result;
			
		
		}
		

}
