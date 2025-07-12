import java.util.*;
class Recursion{
  static int fibonacci(int n){
    if(n<=2) return 1;
    return fib(n-1)+fib(n-2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = ssc.nextInt();
    System.out.println(fibonacci(n));
  }
}
