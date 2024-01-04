package org.example;

public class Factorial  {

    public static long factorialCalculation (long num){
        if (num >0) {
            long sum = 1;
            for (long i = num; 1 < i; i--) {
                sum += sum * (num - 1);
                num--;

            }
            return sum;

        }else {
            throw new RuntimeException("You cannot put number < 0");
        }
    }
}
