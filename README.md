Java Fundamentals. Home Assignment. Reflection
==============================================

The task is to implement a simplistic test execution engine that
executes tests based on the metadata provided with the test classes.


* Implement the unimplemented methods TestSuite class:

  1. getClasses(String packageName) : find all test classes in a given package
  2. getMethods(Class<?> clazz) : find all tests in a test class
  3. executeTest(Method method) : execute single test
  4. printSummary(Class<?> clazz) : after test class execution, the program should print summary of the executed tests

* The test execution should follow the rules manifested by the annotations provided with the framework
 
  1. @Test - indicates that a class is a test class and for a method it indicatest that this is a test method to be executed
  2. @Expected - if the test failes with exception, the framework should be able to handle the failure and mark the test as passed
  3. @Inject - injects a proxy into a field for the specified class instance, e.g. @Inject(Fib.class)

