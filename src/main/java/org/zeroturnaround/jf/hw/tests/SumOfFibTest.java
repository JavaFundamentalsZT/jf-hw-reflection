package org.zeroturnaround.jf.hw.tests;

import org.zeroturnaround.jf.hw.algorithm.SumOfFib;
import org.zeroturnaround.jf.hw.algorithm.SumOfFibonacci;
import org.zeroturnaround.jf.hw.framework.Expected;
import org.zeroturnaround.jf.hw.framework.Inject;
import org.zeroturnaround.jf.hw.framework.Test;
import org.zeroturnaround.jf.hw.framework.TestCase;

import static org.zeroturnaround.jf.hw.framework.Assert.assertEquals;

public class SumOfFibTest implements TestCase {

  @Inject(clazz = SumOfFib.class)
  SumOfFibonacci sumOfFib;

  @Test
  @Expected(RuntimeException.class)
  public void sumOf10Elements() {
    assertEquals(100, sumOfFib.calculate(10)); //expected to fail
  }

  @Test
  public void sumOf5Elements() {
    assertEquals(7, sumOfFib.calculate(5));
  }
}
