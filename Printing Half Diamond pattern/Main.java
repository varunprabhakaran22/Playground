import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int num=in.nextInt();
      for(int row=1;row<=num;row++)
      {
        for(int space=1;space<=num-row;space++)
        {
          System.out.print(" ");
        }
        for(int pattern=1; pattern<=2*row-1;pattern++)
          System.out.print("*");
        System.out.println();
      }
	}
}