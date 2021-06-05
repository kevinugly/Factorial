package math;

import java.math.*;

class FactorialRecursiveTest implements FactorialTest {
  @Override
  public BigInteger calculateFactorial(int number) {
    return Factorial.factorialRecursion(number);
  }
}