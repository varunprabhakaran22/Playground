import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
      arr[i]=in.nextInt();
    }
    int sortSize=(size/2)-1;
    for(int i=0;i<sortSize;i++)
    {
      for(int j=1;j<=sortSize;j++)
      {
        if(arr[i]>arr[j])
        {
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
        
      }
    }
    int sort=sortSize+1;
    for(int i=size-1;i>sortSize;i--)
    {
      for(int j=size-1;j>sortSize;j--)
        
      {
        if(arr[i]<arr[j])
        {
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
    }
    for(int i=0;i<size;i++)
    {
      System.out.print(arr[i]+ " ");
    }
    
  }
}