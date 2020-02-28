package com.bridgelabz.generics;

public class TestMaximumProblem {

    public Integer findMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max)>0) {
            max = secondNumber;
        }
        if(thirdNumber.compareTo(max)>0) {
            max=thirdNumber;
        }
        return max;
    }
}
