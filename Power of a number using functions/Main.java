import java.util.Scanner;
class Main
{
  public static int power(int a,int b)
  {
    int sum=1;
    for(int i=1;i<=b;i++)
    {
      sum=sum*a;
//      System.out.println(sum);
    }
   
    return sum;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int expo=in.nextInt();
    int answer=power(base,expo);
    System.out.print(answer);
    
    
    
    
   // System.out.print("working");
  }
}