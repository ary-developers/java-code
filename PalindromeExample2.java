import java.util.Scanner;   
class Palindrom  
{  
   public static void main(String args[])  
   {  
      String first;
      String second = "";   
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string to check it is a palindrome");  
      first = in.nextLine();   
      int length = first.length();   
      for ( int i = length-1; i >= 0; i-- )  
         second = second + first.charAt(i);  
      if (first.equals(second))  
         System.out.println("Entered string is a palindrome.");  
      else  
         System.out.println("Entered string isn't a palindrome.");   
   }  
}  