package u10pp;

import java.math.BigInteger;

public class RecursiveMath {
  public static double pow(double base, int exponent) {
    return base * pow(base, exponent);
  }

  public static BigInteger getFactorial(int n) {

    // if n is 0, return 1
    if (n == 0) {
      return BigInteger.valueOf(1);
    }

    //
    if (n < 0) {
      throw new IllegalArgumentException("n must be greater than 0");
    }

    BigInteger factorial = BigInteger.ONE;

    for (int i = n; i > 0; i--) {
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    return factorial;
  }

  /**
   * returns the nth number in the fibonacci series
   * 
   * @param args
   */
  public static int getFibonacciNumber(int n) {
    int n1 = 0, n2 = 1, count = 0;

    while (count < n) {
      int temp = n1 + n2;
      n1 = n2;
      n2 = temp;
      count++;
    }
    return n1;

  }

  public static void printFibonacci(int n) {
    int n1 = 0, n2 = 1, count = 0;

    while (count < n) {
      System.out.print(n1 + ", ");
      int temp = n1 + n2;
      n1 = n2;
      n2 = temp;
      count++;
    }
  }

  public static void main(String args[]) {
    int count = 10;
    printFibonacci(count - 2);
  }
}
