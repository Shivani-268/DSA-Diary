import java.util.*;
public class Main {
   //Function to print array
   static void printArray(int arr[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   //Function to reverse array 
   static void reverseArray(int arr[], int n) {
      int p1 = 0, p2 = n - 1;
      while (p1 < p2) {
         int tmp = arr[p1];
         arr[p1] = arr[p2];
         arr[p2] = tmp;
         p1++;
         p2--;
      }
      printArray(arr, n);
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0; i<n; i++){
       arr[i]=sc.nextInt();
     }
      reverseArray(arr, n);

   }
}  
