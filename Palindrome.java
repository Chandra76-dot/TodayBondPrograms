package work_report;

import java.util.Scanner;

class Pallindrome
{
  public static void main(String args[])
  {
    String inputString;
    Scanner sc= new Scanner(System.in);
 
    System.out.println("Input a string");
    inputString = sc.nextLine();
 
    int length  = inputString.length();
    int i, begin, end, middle;
 
    begin  = 0;
    end    = length - 1;
    middle = (begin + end)/2;
 
    for (i = begin; i <= middle; i++) {
      if (inputString.charAt(begin) == inputString.charAt(end)) {
        begin++;
        end--;

        System.out.println("Palindrome");
        break;
      }
      
      else
    	  
    	  System.out.println("Not a palindrome");
       break;
    }
    
  }
}
