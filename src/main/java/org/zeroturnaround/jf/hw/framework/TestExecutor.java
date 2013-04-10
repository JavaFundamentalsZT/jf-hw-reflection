package org.zeroturnaround.jf.hw.framework;

import java.lang.reflect.Method;

public class TestExecutor {

  public static void execute(String packageName) {
    Class[] classes = getClasses(packageName);
    for (Class<?> clazz : classes) {
      executeTests(clazz);
    }
  }

  // you may change the method signature as you like
  private static void executeTests(Class<?> clazz) {
    Method[] methods = getMethods(clazz);
    try {
      Object instance = clazz.newInstance();
      for (Method method : methods) {
        executeTest(instance, method);
      }
      printSummary(instance);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void executeTest(Object instance, Method method) {
    try {
      method.invoke(instance);
      System.out.println("SUCCESS: " + instance.getClass().getSimpleName() + "." + method.getName());
    } catch (Exception e) {
      System.out.println("FAILURE: " + instance.getClass().getSimpleName() + "." + method.getName() + ": " + e.getCause().getMessage());
    }
  }

  private static void printSummary(Object instance) {
    throw new UnsupportedOperationException("implement printing summary");
  }

  private static Method[] getMethods(Class<?> clazz) {
    throw new UnsupportedOperationException("implement getMethods()");
  }

  private static Class[] getClasses(String packageName) {
    throw new UnsupportedOperationException("implement your own package scanning");
  }

}