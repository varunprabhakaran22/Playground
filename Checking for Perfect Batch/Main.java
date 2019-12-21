import java.util.Scanner;
class Main
{
  public static int sumArray(int list[],int size)
  {
    int add=0;
    for(int i=3;i<size;i=i+3)
    {
      add=list[i]+list[i+1]+list[i+2];
    }
    return add;
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int arrSize=in.nextInt();
    int arr[]=new int[arrSize];
    for(int i=0;i<arrSize;i++)
    {
      arr[i]=in.nextInt();
    }
   int batch1=arr[0]+arr[1]+arr[2];
   int batch2=sumArray(arr,arrSize);
    if(batch1==batch2)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
    
  }
}