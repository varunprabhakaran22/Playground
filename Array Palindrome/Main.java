import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int palindrome = 1;
      Scanner s = new Scanner(System.in);
      int size= s.nextInt();
      int[] arr=  new int[size];
      for(int i=0;i<size;i++){
      	arr[i] = s.nextInt();
      }
      for(int i=0;i<size;i++){
        if(i < (size-i+1)){
          if(arr[i] != arr[size-(i+1)]){
            palindrome = 0;
			break;
          }
        }
      }
      
      if(palindrome ==1){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}