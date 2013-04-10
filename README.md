Java Fundamentals. Home Assignment. Reflection
==============================================


The task is to implement a simplistic test execution engine.

* Test execution should follow the rules manifested by the annotations provided with the framework:

  1. @Test - indicates that a class is a test class and for a method it indicates that this is a test method to be executed. Alternatively, the test class can implement the TestCase marker interface with no annotations. 
  2. @Expected - if the test failes with exception, the framework should be able to handle the failure and mark the test as passed.
  3. @Inject - injects a proxy into a field for the specified class instance, e.g. @Inject(Fib.class)

* Tests are executed by TestExecutor class and you will have to implement the missing methods:

  1. getClasses(String packageName) : find all test classes in a given package
  2. getMethods(Class<?> clazz) : find all tests in a test class
  4. printSummary(Class<?> clazz) : after test class execution, the program should print summary of the executed tests

* Expected behavior:

Package *org.zeroturnaround.jf.hw.tests* provides some examples of the tests that we would like to run with the test engine.

Here's the expected output from FibTest execution:

    SUCCESS: FibTest.find1stFibonacciNumber
    SUCCESS: FibTest.find2ndAnd3rdFibonacciNumber
    SUCCESS: FibTest.find10thFibonacciNumber
    FAILURE: FibTest.find15thFibonacciNumberWithFailure: EXPECTED: 55, ACTUAL: 610
    SUMMARY: EXECUTED 4, PASSED 3, FAILED 1, BUSINESS METHODS INVOKED 5


Every test class (see examples in *org.zeroturnaround.jf.hw.tests*) includes a field that represents the unit under test. 
Test engine should count the method invocations for that object using a dynamic proxy and print the results into summary line (e.g. *SUMMARY: EXECUTED 4, PASSED 3,  FAILED 1*).
