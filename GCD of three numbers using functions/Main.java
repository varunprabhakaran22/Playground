import java.util.Scanner;
public class Main{
  public static int Gcd(int a,int b)
  {
    int num=0;
    for(int i=1;i<=a&&i<=b;i++)
    {
      if((a%i==0)&&(b%i==0))
         {
           num=i;
         }        
     }
         return num;
  }
         
	public static void main (String[] args)
	{
	    // Type your code here
      int gcd=0;
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int gcd1=Gcd(n1,n2);
      for(int k=1;k<=gcd1&&k<=n3;k++)
      {
        if((gcd1%k==0)&&(n3%k==0))
           {
             gcd=k;
           }        
      }
           System.out.print(gcd);
           
	}
}