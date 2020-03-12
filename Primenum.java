package work_report;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Primenum
{
  public static void main(String args[])throws IOException
   {
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	int i,j=2;
	System.out.println("Enter the number:");
	i=Integer.parseInt(br.readLine());
	if (i == 0)
	{
		System.out.println("You entered zero....invalid input");
	}
	else
	{
		for(j=2;j<i;j++)
		{
			int k = i%j;
			if(k == 0)
			{ 
				System.out.println("Not Prime number");
				break;
			}
		}
		if(j == i)
		{
			System.out.println("Its a Prime Number");
		} 
	}		
   }
}
