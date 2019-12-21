import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner (System.in);
      String sentence= in.nextLine();
      int len=sentence.length();
      String str="";
     // StringBuilder ss=new StringBuilder(str);
     // StringBuilder s=new StringBuilder(sentence);
      for(int i=len-1;i>=0;i--)
      {
        char ch=sentence.charAt(i);
       if((ch!=' '))
          {
            str=str+ch;
          }
          else
          {
            int lenn=str.length();
           
            reverse_string(str,0,lenn-1);
            str="";
          }
          }
          
         System.out.print(str);
    }
    // Function to reverse a string
    public static void reverse_string(String sb, int start_idx, int end_idx)
    {
        // Type your code here
      for(int j=end_idx;j>=0;j--)
      {
        char a=sb.charAt(j);
        System.out.print(a);
      }
      System.out.print(" ");
      
    }
}