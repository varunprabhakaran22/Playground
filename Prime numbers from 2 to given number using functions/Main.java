import java.util.Scanner;
class Main{
  
  public static void isPrime(int a)
  {
    int flag=0;
    for(int j=2;j<a;j++)
    {
      if((a%j==0))
      {
        flag=1;
        break;
      }
    }
      if((flag==0)&&(a!=1))
        System.out.println(a);
 
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      for(int i=1;i<=num;i++)
      {
        isPrime(i);
      }
	}
}