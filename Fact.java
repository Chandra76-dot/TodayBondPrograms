import java.util.Scanner;
public class Fact {
		public static void main(String[] args) {

			long n,i=1,fact=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number:");
			n=sc.nextInt();
			do
	       {
           fact = fact * i;
	            i++;
	        } while (i<= n);
	        System.out.println("Factorial of " + n + " is: " + fact);
		}
	}
