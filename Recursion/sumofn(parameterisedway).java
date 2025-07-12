import java.util.*;
class Recursion {
    
    static void func(int i, int sum){
        
            // Base Condition.
            if(i<1){
                
                System.out.println(sum);
                return;
            }
            
            // Function call to increment sum by i till i decrements to 1.
            func(i-1,sum+i);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       func(n,0);
    }
}
