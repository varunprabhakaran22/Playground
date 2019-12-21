import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s= new Scanner (System.in);
      int size = s.nextInt();
      int[] arr = new int[size];
      for(int i=0; i<size; i++){
        arr[i] = s.nextInt();
      }
      int val = s.nextInt();
      for(int i=0;i<size;i++){
       for(int j=i+1;j<size;j++){
         if(val == arr[i]+arr[j]){
           System.out.println(arr[i]+", " + arr[j]);
         }
       }
      }
                              
    }
}