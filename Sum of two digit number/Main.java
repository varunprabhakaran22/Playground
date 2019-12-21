import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=n1%10;
      int n3=n1/10;
      System.out.println(n2+n3);
	}
}