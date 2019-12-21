import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in =new Scanner(System.in);
      int num=in.nextInt();
      int copy=num;
      int digit,cube=0;
      while(num>0)
      {
        digit=num%10;
        cube=(digit*digit*digit)+cube;
        num =num/10;
      }
      
      if(cube==copy)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}