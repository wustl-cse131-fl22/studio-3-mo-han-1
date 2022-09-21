package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a number n to find all prime number up to n: ");
		int n = in.nextInt();
		int[] numberList = new int[(n-1)];
		int num;
		int index = 0;
		for (num = 2; num <= n; num++)
		{
			numberList[index] = num;
			index++;
		}
		
		for (int i = 0; i < numberList.length; i++) 
		{
			for(int j = 2; j < numberList[i]; j++)
			{
				if (numberList[i] % j == 0)
				{
					numberList[i] = 0;
				}
			}
		}
		
		for (int element: numberList)
		{
			if (element != 0)
			{
				System.out.println(element);
			}
		}
	}
}
