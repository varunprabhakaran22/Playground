import java.util.Scanner;
class Main{
  public static int greater (int a,int b)
  {
    int great;
    if (a>b)
      great=a;
    else
      great =b;
    return great;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int greatestOfTwo=greater(n1,n2);
      if(greatestOfTwo>n3)
      {
        System.out.print(greatestOfTwo);
      }
      else 
        System.out.print(n3);
      
	}
}