/*Diksha Sharma
Csc 110 Assignment #7
*/

import java.util.Random;
import java.util.Arrays;

public class LotteryTicket
{

	private final int TOTAL_NUMBERS	= 6;											//  Indecating Number of Integers within the lootery ticket.


	private final int MAX_NUMBER = 49;												// Indecating MAX number

	int [] a = new int [TOTAL_NUMBERS];


	public LotteryTicket()
	{
		generate(a);

	}

	/**
	 * This method populates the array a with numbers.
	 * between MIN_NUMBER and MAX_NUMBER and ensures there are no duplicate numbers.
	 * This method also sorts the lottory tickets from smallest value to largest.
	 */
	private void generate (int[] a)
	{


			Random r = new Random();

			for (int i=0;i<TOTAL_NUMBERS;i++)
			{

				a[i] = r.nextInt(MAX_NUMBER)+1;

				for(int j = 0; j < i; j++)											//This nested for loop is to checks that there are no duplicates within the lottory tickek.
				{
					if (a[i] == a[j])
					{
						i--;
						break;
					}

				}
			}
			Arrays.sort(a);
		}

	/**
	 * Using the code from part one as a template this method converts the array into a string
	in order to print it in the required format.
	 */
	public String toString()
	{
	   String lottery = new String("{");
		for(int i= 0;i<this.a.length;i++)
		{
			lottery += (Integer.toString(a[i]));
			if (i!=this.a.length-1)
			{
			lottery += (",");
			}
		}
		lottery += ("}");

		return  lottery;
	}

	public boolean matches(LotteryTicket other)
	{
		if(a.equals(other))															 //this will find the lottery ticket number matched
		return true;
		else

		return false;
	}
}