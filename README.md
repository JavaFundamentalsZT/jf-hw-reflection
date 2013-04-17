Java Fundamentals. Home Assignment. Reflection
==============================================


The task is to implement a simplistic test execution engine.

#### Test execution should follow the rules manifested by the annotations provided with the framework:

  1. @Test - indicates that a class is a test class and for a method it indicates that this is a test method to be executed. Alternatively, the test class can implement the TestCase marker interface with no annotations. Examples: 
```java
public class FibTest implements TestCase { 
```
```java
@Test
public class FibTest { 
```

  2. @Expected - if the test failes with exception, the framework should be able to handle the failure and mark the test as passed.
```java
@Expected(RuntimeException.class)
public void compareIntegers() { 
    assertEquals(4, 5);
}
```
In the example above, the equality assertion for the numbers 4 and 5 will throw RuntimeException. The test engine should handle the exception: if the method is marked with @Expected annotation and the annotation parameter matches the exception type that was thrown by test method execution, then the test should be considered as successful.

*NB!* In case if the test method doesn't throw an exception but it is annotated with @Expected, then the test should be considered as FAILED, since we are expecting that the test to fail and it doesn't - so it doesn't meet our exepectations.

*NB!* If the test throws an exception which is subclass of the declared exception type, then it is a valid situation and the test should be marked as a successful one.


  3. @Inject - injects a proxy into a field for the specified class instance, e.g: 
```java
@Inject(Fib.class)
Fibonacci fib;
```  
  

#### Tests are executed by TestExecutor class and you will have to implement the missing methods:

  1. getClasses(String packageName) : find all test classes in a given package.
Hint: you can obtain an instance of a relevant class loader:
```java
ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
```  
And then apply *ClassLoader.getResources(...)* method to locate the available class files.
Remember that you can load classes dynamically by fully qualified name: *Class.forName("org.zeroturnaround.jf.hw.tests.MyTest")*

  2. executeTests(Class<?> clazz) : execute the tests for a given class (instance).

#### Expected behavior:

Package *org.zeroturnaround.jf.hw.tests* provides some examples of the tests that we would like to run with the test engine.

Here's the expected output from FibTest execution:

    SUCCESS: FibTest.find1stFibonacciNumber
    SUCCESS: FibTest.find2ndAnd3rdFibonacciNumber
    SUCCESS: FibTest.find10thFibonacciNumber
    FAILURE: FibTest.find15thFibonacciNumberWithFailure: EXPECTED: 55, ACTUAL: 610
    SUMMARY: EXECUTED 4, PASSED 3, FAILED 1, BUSINESS METHODS INVOKED 5

Notes:
-------

EXECUTED 4 - FibTest has 4 methods marked with @Test annotation and 4 of them were executed
    
PASSED 3 - 3 tests passed successfully
    
FAILED 1 - 1 test failed (find15thFibonacciNumberWithFailure)
    
BUSINESS METHODS INVOKED 5 - fib.calculate() was invoked 5 times




