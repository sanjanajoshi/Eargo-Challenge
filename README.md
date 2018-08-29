# Eargo-Challenge
Problem 1:
 Write a function to calculate change for given number (number represents cents) 
The function will return list, vector or collection of numbers representing the number of 
quarters(25), dimes(10), nickels (5), pennies (1) that would yield the correct change. 
#Example: For 83cents, the function will return 3 quarters, 0 dime, 1 nickel and 3 pennies.

Solution: The idea is to use the greedy approach i.e for a given number it tries to give as many quarters as possible first. Then, it goes on to check dime, nickel and pennies in the last.
HOW TO EXECUTE THE PROGRAM:
1. Run the program on Eclipse
2. Enter a positive integer

Problem 2:
Write a function to find out the best Buying and Selling day for maximum gain from daily stock prices of last 10 days. Following are 2 rules,
1.	Buy first
2.	You can only buy once and sell once
#Example:
#Below table represents stock_price for last 10 days:
#Function should return Day 6 as buying day and Day 9 as selling day. Total gain is $53.
														
Solution: The idea is to find the price that is the least in the past ten days, that day would be the buying day of the stock and that will be the buying price. After the buying day, we search for the price that is maximum in the remaining number of days so that we can sell the stock and the selling price - buying price gives us the maximum profit.
So, if the least price is on the last day (i.e the stock prices go in a decreasing order from 1st day then we would incur 0 maximum profit as we cannot sell it in the past 10 days considering the rules of buy first and then sell and both can be done only once.)
		|Day		|	Stock 	|	Price|
		| --- | --- | --- |
		|Day	|		1	|	$3	|
		|Day 	|		2	|	$8	|
		||Day 	|		3	|	$8	|
		|Day 	|		4	|	$55	|
		|Day	 |		5	|	$38	|
		|Day 	|		6	|	$1	|
		|Day 	|		7	|	$7	|
		|Day 	|		8	|	$42	|
		|Day 	|		9	|	$54	|
		|Day 	|		10	|	$53	|

HOW TO EXECUTE THE PROGRAM:
1. Run the program on Eclipse
2. Enter 10 numbers.
