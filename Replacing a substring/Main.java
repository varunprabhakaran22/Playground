import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in=new Scanner(System.in);
      String input=in.nextLine();
      String replae=in.nextLine();
      String replaceWith=in.nextLine();
//      String arr[]=new String[];
      int len=input.length();
      int count=1;
      for(int i=0;i<len-1;i++)
      {
        char ch=input.charAt(i);
        if((ch==' '))
        {
          count++;
        }
      }
      /*String arr[]=new String[count];
      System.out.print(count);
      
        for(int i=0;i<len;i++)
      {
        String letter="";
        char ch=input.charAt(i);
        if((ch!=' '))
        {
         
          letter=letter+ch;
        }
          else
          {
       System.out.print(letter);
            letter="";
          }
        
      // else
       
        // arr[i]=letter;
      //  letter="";
       
        //  System.out.print(letter);
          
      }
     for(int i=0;i<count;i++)
     {
       System.out.print(arr[i]);
     }
         */
      String re=input.replace(replae,replaceWith);
        System.out.print(re);
      
      
      
    }
}