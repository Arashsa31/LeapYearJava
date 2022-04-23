/**
 * @author Arash
 *Write a program that determines if a given year is a leap year. Leap years are those years that are 
 *divisible by four, except that century years not divisible by 400 are not leap years. 
 *For example, 1960, 1996, and 2000 are leap years, while 1961, 1995, and 1900 are not.
 *Your program should ask the user to enter a year and then determine whether that year is a leap year.  
 *Repeat until the user enters 0 for the year.
 *
 *The following is an example program run (the user's input is underlined).
 *Enter a year (0 to stop): 1960
 *1960 is a leap year.
 *Enter a year (0 to stop): 1996
 *1996 is a leap year.
 *Enter a year (0 to stop): 2000
 *2000 is a leap year.
 *Enter a year (0 to stop): 1961
 *1961 is not a leap year.
 *Enter a year (0 to stop): 1995
 *1995 is not a leap year
 *Enter a year (0 to stop): 1900
 *1900 is not a leap year
 *Enter a year (0 to stop): 0
 *Bye.
 *
 */
import java.util.*;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		/**
		 * if (year is not divisible by 4) then (it is a common year)
		 * else if (year is not divisible by 100) then (it is a leap year)
		 * else if (year is not divisible by 400) then (it is a common year)
		 * else (it is a leap year)
		 */
		
		while (true)
		{
			//takes the user input
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a year: (0 to stop) ");
			int year = keyboard.nextInt();
			
			//check if the loop needs to break
			if (year == 0)
			{
				System.out.println("Bye.");
				break;
			}
			
			boolean flag; //true for leap year
			
			//check leap year
			if (year%4 != 0)
				flag = false;
			else if (year%100 != 0)
				flag = true;
			else if (year%400 != 0)
				flag = false;
			else flag = true;
			
			if (flag)
				System.out.println(year + " is a leap year!");
			else
				System.out.println(year + " is NOT a leap year!");
			
		}		
	}
}
