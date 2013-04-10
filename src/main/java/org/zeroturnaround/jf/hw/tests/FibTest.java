package org.zeroturnaround.jf.hw.tests;

import org.zeroturnaround.jf.hw.algorithm.Fib;
import org.zeroturnaround.jf.hw.algorithm.Fibonacci;
import org.zeroturnaround.jf.hw.framework.Inject;
import org.zeroturnaround.jf.hw.framework.Test;

import static org.zeroturnaround.jf.hw.framework.Assert.assertEquals;

@Test
public class FibTest {

  @Inject(Fib.class)
  Fibonacci fib;

  @Test
  public void find1stFibonacciNumber() {
    assertEquals(1, fib.calculate(1));
  }

  @Test
  public void find2ndAnd3rdFibonacciNumber() {
    assertEquals(1, fib.calculate(2));
    assertEquals(2, fib.calculate(3));
  }

  @Test
  public void find10thFibonacciNumber() {
    int result = fib.calculate(10);
    assertEquals(55, result);
  }

}
