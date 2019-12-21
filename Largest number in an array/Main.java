import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arrSize=in.nextInt();
      int arr[]=new int[arrSize];
      for(int i=0;i<arrSize;i++)
      {
        arr[i]=in.nextInt();
      }
      int arrMax=arr[0];
      for(int j=0;j<arrSize;j++)
      {
        if(arrMax<arr[j])
        {
          arrMax=arr[j];
        }
      }
      System.out.print(arrMax);
        
    }
}