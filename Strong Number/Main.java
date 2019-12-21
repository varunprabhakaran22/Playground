import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int copy=num,digit, strong=0,fact=1;
      while(num>0)
      {
        digit=num%10;    
        for(int i=1;i<=digit;i++)
        {
          fact=fact*i;
        }
       strong=strong+fact; 
        fact=1;
        num=num/10;
      }
      if(strong==copy)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}