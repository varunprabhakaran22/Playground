import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner (System.in);
      int n=s.nextInt();
      int b=(n/10)%10;
      System.out.println(b);
	}
}