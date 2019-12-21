import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner (System.in);
      int aSize=in.nextInt();
      int arr[]=new int[aSize];
      for(int i=0;i<aSize;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int i=0;i<aSize;i++)
      {
        if(arr[i]!=0)
        {
          System.out.print(arr[i] + " ");
        }
      }
      for(int i=0;i<aSize;i++)
      {
        if(arr[i]==0)
        {
          System.out.print(arr[i] + " ");
        }
      }
     
    /*  for(int i=0;i<aSize;i++)
      {
        System.out.print(arr[i]+ " ");
      }
      */
    }
}