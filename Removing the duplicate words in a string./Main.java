import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String name=in.nextLine();
    String[] sub=name.split(" ");
    int len=sub.length;
   // System.out.print(len);
    for(int i=0;i<len;i++)
    {
      if((sub[i]!=" "))
      {
        for(int j=i+1;j<len;j++)
        {
          if(sub[i].equals(sub[j]))
             {
               sub[j]=" ";
             }
         }
      }            
     }
             for(int i=0;i<len;i++)
             {
               if(sub[i]!=" ")
               {
                 System.out.print(sub[i]+" ");
               }
             }
             
  }
}