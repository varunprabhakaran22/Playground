import java.util.Scanner;
class Main{
  public static int addDigit(int number)
  {
    int sum=0;
    for(int i=1;i<=number;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int num=in.nextInt();
      int sumOf=addDigit(num);
      System.out.println(sumOf);
	}
}