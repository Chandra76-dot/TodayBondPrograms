package work_report;
import java.util.Scanner;
public class Greatestnum
{
		public static void main(String[] args) {
			int number[], size, large;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array :");
			size = sc.nextInt();
			number = new int[size];
			System.out.print("Enter array of elements :");
			for (int i = 0; i < number.length; i++) 
			{
				number[i] = sc.nextInt();
			}
			large = number[0];
			for (int i = 1; i < number.length; i++) 
			{
				if (large < number[i]) 
				{
					large = number[i];
				}
			}
			System.out.print("Largest number is :" + large);
		}
}
