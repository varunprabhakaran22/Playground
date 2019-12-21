import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=1;
      for(int row=1;row<=num;row++)
      {
        for(int space=1; space<=num-row;space++)
        {
          System.out.print(" ");
        }
        for(int pattern=1; pattern<=row; pattern++)
        {
          System.out.print(sum+" ");
          sum =sum+1;
        }
        System.out.println();
        }
    }    
}