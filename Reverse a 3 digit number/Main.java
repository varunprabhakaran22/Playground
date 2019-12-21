import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in= new Scanner (System.in);
    int num =in.nextInt();
    int rev =num%10;
    int mul =rev*10;
    int second =(num/10)%10;
    int mull=mul+second;
    int first=num/100;
    int mulll =(mull*10)+first;
    System.out.println(mulll);
  }
}