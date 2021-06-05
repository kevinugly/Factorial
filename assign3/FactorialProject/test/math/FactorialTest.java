package math;

import java.math.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public interface FactorialTest {
  BigInteger calculateFactorial(int number);

  @Test
  default void testFactorial() {
    BigInteger fifty = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");

    assertAll(
      () -> assertEquals(BigInteger.valueOf(1), calculateFactorial(0)),
      () -> assertEquals(BigInteger.valueOf(1), calculateFactorial(1)),
      () -> assertEquals(BigInteger.valueOf(2), calculateFactorial(2)),
      () -> assertEquals(BigInteger.valueOf(120), calculateFactorial(5)),
      () -> assertEquals(BigInteger.valueOf(3628800), calculateFactorial(10)),
      () -> assertEquals(fifty, calculateFactorial(50))
    );
  }
}