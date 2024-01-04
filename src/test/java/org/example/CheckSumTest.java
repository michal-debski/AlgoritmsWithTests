package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckSumTest {

private final CheckSum checkSum = new CheckSum();
    @Test
    void sumsToTargetTest() {
        Integer [] integerListsTest = {2,3,4};
        int target = 8;
        boolean expected = false;
        Assertions.assertEquals(expected,checkSum.sumsToTarget(integerListsTest,target));
    }

}