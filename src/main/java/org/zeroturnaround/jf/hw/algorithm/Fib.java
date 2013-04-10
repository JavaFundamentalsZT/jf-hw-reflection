package org.zeroturnaround.jf.hw.algorithm;

public class Fib implements Fibonacci {

  public int calculate(int n) {
    if (n < 2) {
      return n;
    } else {
      return calculate(n - 1) + calculate(n - 2);
    }
  }

}
