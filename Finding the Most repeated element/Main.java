

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
    int fre[]=new int[size];
    int count=1;
    int maxCount=0;
    for(int i=0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
        if(arr[i]==arr[j])
        {
          count=0;
          count++;
        }
        fre[i]=count;
        count=0;
      }
    }
    
    
    for(int i=0;i<size;i++)
    {
      if(fre[i]>fre[maxCount])
      {
        maxCount=i;
      }
    }
    System.out.print(arr[maxCount]);
    
  }
}