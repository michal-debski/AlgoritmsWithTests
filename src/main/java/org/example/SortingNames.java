package org.example;

import java.util.ArrayList;
import java.util.List;

public class SortingNames {
    /*1 zadanie -> sortowanie alfabtetycznie po imionach po 1 literach a drugie litery na odwrot od z do a
        a) napisz funkcjonalnosc ktora to obsluzy
        b) napisz testy które sprawdzą co najmniej 3 przypadki rozne, czyli 3 testy*/
    List<String> nonSortedNames = List.of("Adrian", "Celina", "Beata", "Anna");

    public List<String> returningNames() {

        return nonSortedNames.stream().sorted().toList();
    }

    public List<String> returningSortedBySecondLetter() {
        List<String> randomList = new ArrayList<>();
        List<String> listSortedByFirstLetter = nonSortedNames.stream().sorted().toList();
        for (int i = 1; i < listSortedByFirstLetter.size(); i++) {
            char firstLetter1 = listSortedByFirstLetter.get(i).charAt(0);
            char firstLetter2 = listSortedByFirstLetter.get(i-1).charAt(0);
            if (firstLetter1 == firstLetter2) {
                for (int j = 1; j < listSortedByFirstLetter.size(); j++) {
                    char secondLetter = listSortedByFirstLetter.get(j).charAt(1);
                    char secondLetter2 = listSortedByFirstLetter.get(j - 1).charAt(1);
                    if (secondLetter > secondLetter2) {
                        randomList.add(listSortedByFirstLetter.get(j));
                        randomList.add(listSortedByFirstLetter.get(j-1));
                    }
                }
            } else {
                randomList.add(listSortedByFirstLetter.get(i));
            }


        }
        return randomList;
    }

    public List<Integer> namesLetterNumbers() {
        List<String> listSortedByFirstLetter = nonSortedNames.stream().sorted().toList();

        return listSortedByFirstLetter.stream()
                .map(String::length)
                .sorted()
                .toList();
    }
}

