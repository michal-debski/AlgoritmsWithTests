package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void isPerfectNumber() {
        boolean expectedBool = true;

        Assertions.assertEquals(expectedBool,PerfectNumber.isPerfectNumber(28));
    }

    @Test
    void messageFromExceptionWhenNumberEqualsZero() {
        String expectedMessage = "You cannot use value equals 1!";
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> PerfectNumber.isPerfectNumber(0)
                , "You cannot use value equals 0!");
        Assertions.assertEquals(expectedMessage, runtimeException.getMessage());

    }
}