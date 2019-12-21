import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan=new Scanner(System.in);
    String input=scan.nextLine();
    int len=input.length();
    for(int i=0;i<len;i++)
    {
      if((input.charAt(i)!='a')&&(input.charAt(i)!='e')&&(input.charAt(i)!='i')&&(input.charAt(i)!='o')&&(input.charAt(i)!='u'))
      {
        System.out.print(input.charAt(i));
      }
    }
  }
}