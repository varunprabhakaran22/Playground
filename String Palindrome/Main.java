import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      String rev="";      
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int len=str.length();
      
      for(int i=len-1;i>=0;i--)
      {
        char  ch=str.charAt(i);
        rev=rev+ch;
      }
      
     // System.out.print(rev);
      if(rev.equals(str))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}