Java Fundamentals. Home Assignment. Reflection
==============================================


The task is to implement a simplistic test execution engine.

* The test execution should follow the rules manifested by the annotations provided with the framework:

  1. @Test - indicates that a class is a test class and for a method it indicatest that this is a test method to be executed. Alternatively, a test class can implement the TestCase marker interface with no annotations. 
  2. @Expected - if the test failes with exception, the framework should be able to handle the failure and mark the test as passed.
  3. @Inject - injects a proxy into a field for the specified class instance, e.g. @Inject(Fib.class)

* The tests are executed by TestExecutor class and you will have to implement the missing methods:

  1. getClasses(String packageName) : find all test classes in a given package
  2. getMethods(Class<?> clazz) : find all tests in a test class
  4. printSummary(Class<?> clazz) : after test class execution, the program should print summary of the executed tests

* The expected behavior:

Package *org.zeroturnaround.jf.hw.tests* provides some examples of the tests that we would like to run with the test engine.

Here's the expected output from FibTest execution:

    SUCCESS: FibTest.find1stFibonacciNumber
    SUCCESS: FibTest.find2ndAnd3rdFibonacciNumber
    SUCCESS: FibTest.find10thFibonacciNumber
    FAILURE: FibTest.find15thFibonacciNumberWithFailure: EXPECTED: 55, ACTUAL: 610
    SUMMARY: PASSED 3,  FAILED 1
