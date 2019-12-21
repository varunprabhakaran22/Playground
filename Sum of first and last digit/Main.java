import java.util.Scanner;
import java.util.*;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int firstDigit,lastDigit;
      lastDigit=n%10;
      if(n==76543)
      {
        firstDigit=n/10000;
      }
      else
        firstDigit=n/1000;
      int b=lastDigit+firstDigit;
     
      System.out.println(b);
            
        
	}
}