package org.zeroturnaround.jf.hw.framework;

public class Assert {
	private static final String EXPECTED = "EXPECTED: ";
	private static final String ACTUAL = "ACTUAL: ";

	public static void assertEquals(int expected, int actual) {
		if (expected != actual) {
			throw new RuntimeException(EXPECTED + expected + ", " + ACTUAL + actual);
		}
	}

}
