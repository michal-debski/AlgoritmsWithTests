package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SortingNamesTest {
    SortingNames sortingNames = new SortingNames();
    @Test
    void sortingByFirstLetterTest() {
        List<String> namesListExpected = List.of("Adrian", "Anna", "Beata", "Celina");
        Assertions.assertEquals(namesListExpected, sortingNames.returningNames());

    }
    @Test
    void sortingBySecondLetterTest(){
        List<String> namesSortedBySecondLetterExpected = List.of("Anna","Adrian", "Beata", "Celina");
        Assertions.assertEquals(namesSortedBySecondLetterExpected, sortingNames.returningSortedBySecondLetter());
    }
    @Test
    void sortedByNumberOfNamesLettersTest(){
        List<Integer> namesLettersNumberExpected = List.of(4,5,6,6);
        Assertions.assertEquals(namesLettersNumberExpected, sortingNames.namesLetterNumbers());

    }


}