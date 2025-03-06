public class Fibonacci{
  public static int fib(int num)
  {
    if(num <= 1)
    {
      return num;

    }
    return fib(num-1) + fib(num-2);
  }
  public static void main(String args[])
  {
    int num =10;
    System.out.println("FIBONCCI SERIES:");
    for(int i = 0; i < num; i++)
    {
      System.out.println(fib(i) + "");
    }
  }
}