import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int num=in.nextInt();
      for(int i=1;i<=num;i++)
      {
        for(int j=1;j<=num;j++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
	}
}