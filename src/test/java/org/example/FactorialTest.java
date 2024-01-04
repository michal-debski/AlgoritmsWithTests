package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void factorialCalculation() {
        long expectedResult = 24;

        Assertions.assertEquals(expectedResult, Factorial.factorialCalculation(4));
    }

    @Test
    void minusNumberTest() {

        Assertions.assertThrows(RuntimeException.class, () -> Factorial.factorialCalculation(-3),
                "You cannot put number < 0");
    }
}
