import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }int count=0;
      for(int i=0;i<size;i++)
      {
        //for(int j=1;j<size;j++)
       // {
          if((arr[i]==1))
             //&&(arr[i]==arr[j]))
            count++;
       // }
        }
      System.out.print(count-1);
    }
}

