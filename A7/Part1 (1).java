/*Diksha Sharma

Csc 110 Assignment #7
*/


import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class Part1
{
	public static final int	TOTAL_NUMBERS = 6;


	public static final int MAX_NUMBER	= 49;

	public static void generate (int[] a)
	{


		Random r = new Random();

		for (int i=0;i<TOTAL_NUMBERS;i++)
		{

			a[i] = r.nextInt(MAX_NUMBER)+1;
																						//used a nested for loop to check the previously added integers for duplicates.
			for(int j = 0; j < i; j++)
			{
			if (a[i]	== a[j]){
				i--;
				break;
			}

			}
		}


	}

																						/**
																					     * This method prints all the elements of an array
																			             * on one line enclosed in {}.
																					     */
	public static void display (int[] n)
	{
		System.out.print("{");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]);
			if (i!=n.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

																						/**
																						This is the Main method, calles the methods above.
																						 */
	public static void main (String[] args){
		int[] theNums = new int[TOTAL_NUMBERS];

		generate(theNums);


		Arrays.sort(theNums);

		display(theNums);

	}
}