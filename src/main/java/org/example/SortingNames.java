package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNames {
    /*1 zadanie -> sortowanie alfabtetycznie po imionach po 1 literach a drugie litery na odwrot od z do a
        a) napisz funkcjonalnosc ktora to obsluzy
        b) napisz testy które sprawdzą co najmniej 3 przypadki rozne, czyli 3 testy*/
    List<String> nonSortedNames = List.of("Adrian", "Celina", "Beata", "Anna");

    public List<String> returningNames() {

        return nonSortedNames.stream().sorted().toList();
    }

    public List<String> returningSortedBySecondLetter() {

        return nonSortedNames.stream().sorted(
                Comparator.comparing((String a) -> a.charAt(0))
                        .thenComparing(Comparator.comparing((String b) -> b.charAt(1)).
                                reversed())).collect(Collectors.toList());

    }

    public List<Integer> namesLetterNumbers() {
        List<String> listSortedByFirstLetter = nonSortedNames.stream().sorted().toList();

        return listSortedByFirstLetter.stream()
                .map(String::length)
                .sorted()
                .toList();
    }
}

