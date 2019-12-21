import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner (System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      if((a>b)&&(a>c))
          System.out.println(a);
      else if (c>b)
        System.out.println(c);
      else
        System.out.println(b);
      
    }
}