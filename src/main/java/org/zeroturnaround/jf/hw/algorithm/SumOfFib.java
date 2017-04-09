package org.zeroturnaround.jf.hw.algorithm;

public class SumOfFib implements SumOfFibonacci {

	@Override
	public int calculate(int n) {
		int sum = 0;

		Fibonacci fibonacci = new Fib();
		for (int i = 0; i < n; i++) {
			sum += fibonacci.calculate(i);
		}

		return sum;
	}

}
