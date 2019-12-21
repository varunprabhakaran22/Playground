import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      
      int a= s.nextInt();
      int b= a%10;
      int c=a/100;
      int d=b+c;
      System.out.println(d);
	}
}