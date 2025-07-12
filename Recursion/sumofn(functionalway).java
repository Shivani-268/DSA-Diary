import java.util.*;
class Recursion {
    
    static int func(int n){
        
            // Base Condition.
            if(n == 0){
                
                return 0;
            }
            
            // Problem broken down into 2 parts and then combined.
            return n + func(n-1);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       Scanner sc = new Scanner(System.in);
       System.out.println(func(n));
    }
}
