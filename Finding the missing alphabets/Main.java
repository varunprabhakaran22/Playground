import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in=new Scanner(System.in);
      String input=in.nextLine();
     // String input=str.toLowercase();
      int len=input.length();
      int arr[]=new int[26];
      for(int i=0;i<26;i++)
      {
        arr[i]=0;
      }
      for(int i=0;i<len;i++)
      {
        char ch=input.charAt(i);
        if((ch>='a')&&(ch<='z'))
        {
          arr[input.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<len;i++)
          {
            char ch=input.charAt(i);
            if((ch>='A')&&(ch<='Z'))
            {
              arr[input.charAt(i)-'A']++;
            }
          }
      for(int i=0;i<26;i++)
      {
        if(arr[i]==0)
        {
          char ch=(char) (i+'a');
          System.out.print(ch+" ");
        }
      }
      
    }
}