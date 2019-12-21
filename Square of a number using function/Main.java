import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    return num*num;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner (System.in);
      int number=in.nextInt();
      int squareNum=square(number);
      System.out.println(squareNum);
	} 
}