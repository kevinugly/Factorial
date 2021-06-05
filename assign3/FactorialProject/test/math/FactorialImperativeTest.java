package math;

import java.math.*;
import org.junit.jupiter.api.*;

public class FactorialImperativeTest implements FactorialTest {
  @Test
  void canary() {
    assert(true);
  }

  @Override
  public BigInteger calculateFactorial(int number) {
    return Factorial.factorialImperative(number);
  }
}