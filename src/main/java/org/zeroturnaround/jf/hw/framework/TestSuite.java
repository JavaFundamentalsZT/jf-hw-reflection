package org.zeroturnaround.jf.hw.framework;

import java.lang.reflect.Method;

public class TestSuite {

  public static void execute(String packageName) {
    Class[] classes = getClasses(packageName);
    for (Class<?> clazz : classes) {
      executeTests(clazz);
      printSummary(clazz);
    }
  }

  // you may change the method signature as you like
  private static void executeTests(Class<?> clazz) {
    Method[] methods = getMethods(clazz);
    for (Method method : methods) {
      try {
        executeTest(method);
        System.out.println("SUCCESS:" + method.getName());
      } catch (Exception e) {
        System.out.println("FAILURE:" + method.getName() + ": " + e.getMessage());
      }
    }

  }

  private static void printSummary(Class<?> clazz) {
    throw new UnsupportedOperationException("implement test class execution summary");
  }

  private static void executeTest(Method method) throws Exception {
    throw new UnsupportedOperationException("implement test execution procedure");
  }

  private static Method[] getMethods(Class<?> clazz) {
    throw new UnsupportedOperationException("implement getMethods()");
  }

  private static Class[] getClasses(String packageName) {
    throw new UnsupportedOperationException("implement your own package scanning");
  }

}