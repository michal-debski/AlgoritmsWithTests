package org.example;

public class CheckSum {

    public Boolean sumsToTarget(Integer[] arr, Integer target) {

        for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - 1; j > 0; j--) {
                    if(i != j){
                    if (arr[i] + arr[j] == target) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
