package math;

import java.math.*;
import java.util.stream.*;

public interface Factorial {
  static BigInteger factorialImperative(int number) {
    var factorial = BigInteger.ONE;

    for(int x = 1; x <= number; x++) {
      factorial = factorial.multiply(BigInteger.valueOf(x));
    }

    return factorial;
  }

  static BigInteger factorialRecursion(int number) {
    return number == 0 ? BigInteger.ONE : BigInteger.valueOf(number).multiply(factorialRecursion(number - 1));
  }

  static BigInteger factorialFunctional(int number) {
    return IntStream.rangeClosed(1, number)
      .mapToObj(BigInteger::valueOf)
      .reduce(BigInteger.valueOf(1), BigInteger::multiply);
  }
}