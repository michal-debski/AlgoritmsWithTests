package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(dividers(496));
        System.out.println(isPerfectNumber(6));
    }


    public static boolean isPerfectNumber(long number) {
        List<Long> dividersList = dividers(number);

        Optional<Long> sum = dividersList.stream().reduce(Long::sum);
        return Optional.of(number).equals(sum);
    }

    public static List<Long> dividers(long numberToDivide) {

        List<Long> dividerNumbers = new ArrayList<>();
        if (numberToDivide == 0) {
            throw new RuntimeException("You cannot use value equals 0!");
        }else{
            for (long i = numberToDivide; 0 < i; i--) {
                if (numberToDivide % i == 0) {
                    dividerNumbers.add(i);
                }
            }
            dividerNumbers.remove(numberToDivide);
        }
        return dividerNumbers;
    }


}
