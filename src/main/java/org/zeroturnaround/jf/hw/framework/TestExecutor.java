package org.zeroturnaround.jf.hw.framework;

public class TestExecutor {

  public static void execute(String packageName) {
    Class[] classes = getClasses(packageName);
    for (Class<?> clazz : classes) {
      executeTests(clazz);
    }
  }

  // you may change the method signature as you like
  private static void executeTests(Class<?> clazz) {
    throw new UnsupportedOperationException("implement your own test execution logic");
  }

  private static Class[] getClasses(String packageName) {
    throw new UnsupportedOperationException("implement your own package scanning");
  }

}