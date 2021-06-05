package math;

import java.math.*;

class FactorialFunctionalTest implements FactorialTest {
  @Override
  public BigInteger calculateFactorial(int number) {
    return Factorial.factorialFunctional(number);
  }
}