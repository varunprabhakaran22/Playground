import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=0;
      for(int a=1;a<=num;a++)
        sum=sum+a;
      System.out.println(sum);
	}
}