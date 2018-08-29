package problem2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockProfit {
	//Keeping tab of the buying and selling day. Class variables lets us access it in all the methods
	static int dayBuy = 0;
    static int daySell = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input the prices for the past 10 days
		Scanner input = new Scanner(System.in);
		//Array to store the stock prices
        int prices[] = new int[10];
        
        System.out.println("Enter ten numbers now.");
        for (int i = 0 ; i < prices.length; i++ ) {
           prices[i] = input.nextInt();
        }
       input.close(); 
       
       //Maximum profit accumulated stored in res
       int res = maxProfit(prices);
       
       //Printing maximum profit and the days if res > 0.
       if(res>0){
    	   System.out.println("Day Buy "+dayBuy+" Day Sell "+ daySell);
    	   System.out.println("Maximum profit is " +res);
       }
       //If res == 0, stocks are in decreasing order and hence cannot make a profit
       else{	   
    	   System.out.println("You cannot buy and sell the stock to make a maximum profit in the past ten days");	   
       }
    }

		
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;   
	    int minPrice  = Integer.MAX_VALUE;
	    for(int i = 0; i < prices.length; i++){
	        if(prices[i] < minPrice){
	            minPrice = prices[i]; 
	            dayBuy = i+1;	                
	        }
	        else if(maxProfit < prices[i]-minPrice){
	            maxProfit = prices[i]-minPrice;
	            daySell = i+1;	               
	        }	            
	        
	    }
	        return maxProfit;
	}
}
