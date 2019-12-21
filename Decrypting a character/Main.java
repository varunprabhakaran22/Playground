import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int num=in.nextInt();
      char chh;
     // System.out.print(ch);
      if((ch>= 'Z')&&(ch<='z'))
      {
      chh=(char) (ch+26-num);
      System.out.print(chh);
      }
      else
      {
        chh=(char) (ch-num);
        System.out.print(chh);
      }
      
      
    }
}