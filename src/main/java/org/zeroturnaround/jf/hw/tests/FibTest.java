package org.zeroturnaround.jf.hw.tests;

import org.zeroturnaround.jf.hw.algorithm.Fib;
import org.zeroturnaround.jf.hw.algorithm.Fibonacci;
import org.zeroturnaround.jf.hw.framework.Inject;
import org.zeroturnaround.jf.hw.framework.Test;

import static org.zeroturnaround.jf.hw.framework.Assert.assertEquals;

//    Expected test execution output:
//
//    ------------------------------------------------------------------------------
//    SUCCESS: FibTest.find1stFibonacciNumber
//    SUCCESS: FibTest.find2ndAnd3rdFibonacciNumber
//    SUCCESS: FibTest.find10thFibonacciNumber
//    FAILURE: FibTest.find15thFibonacciNumberWithFailure: EXPECTED: 55, ACTUAL: 610
//    SUMMARY: EXECUTED 4, PASSED 3, FAILED 1, BUSINESS METHODS INVOKED 5
//    ------------------------------------------------------------------------------
//
//    Notes:
//    EXECUTED 4 - FibTest has 4 methods marked with @Test annotation and 4 of them were executed
//    PASSED 3 - 3 tests passed successfully
//    FAILED 1 - 1 test failed (find15thFibonacciNumberWithFailure)
//    BUSINESS METHODS INVOKED 5 - fib.calculate() was invoked 5 times

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
    assertEquals(55, fib.calculate(10));
  }

  @Test
  public void find15thFibonacciNumberWithFailure() {
    assertEquals(55, fib.calculate(15));
  }

}
