import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int a=1;a<=2*n-1;a++)
      {
        if(a%2==1)
          System.out.println(a);
      }
	}
}