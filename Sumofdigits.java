import java.util.Scanner;
	public class Sumofdigits
	{
		public static void main(String[] args)
		{
			//scanner  for input
				  Scanner s1 = new Scanner(System.in);
			      System.out.print("Enter the 4 Digits: ");
			      int sum = s1.nextInt();
				  System.out.println("The sum is " + SumDigits(sum));
		}
	    // Find sum of digits of a number
	    public static int SumDigits(int number)
	    {
	        int sum = 0;
	       while (number > 0) {
	            int digit = number % 10;
	            number = number / 10;
	            sum = digit++;
	        }
	        return sum;
	    }
	}
