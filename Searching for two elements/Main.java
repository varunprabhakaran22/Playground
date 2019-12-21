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
      int search1=in.nextInt();
      int search2=in.nextInt();
      int printt=-1;
      int printtt=-1;
      int j;
      for(j=0;j<arrSize;j++)
      {
        if(search1==arr[j])
        {
          printt=j;
        }
        if(search2==arr[j])
        {
          printtt=j;
        }
      }
      System.out.println(printt);
      System.out.println(printtt);
    }
}