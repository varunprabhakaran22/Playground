import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
//      Scanner in =new Scanner (System.in);
      int row=in.nextInt();
      int flag =1;
      for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(flag==1)
          {
            System.out.print("*");
            flag=0;
          }
          else
          {
            System.out.print("#");
            flag=1;
          }
        }
        System.out.println();
      }
    }
}