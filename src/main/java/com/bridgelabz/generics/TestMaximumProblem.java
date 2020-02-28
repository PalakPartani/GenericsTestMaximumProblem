package com.bridgelabz.generics;

public class TestMaximumProblem {

    public <E extends Comparable<E>> E findMaximum(E firstNumber, E secondNumber, E thirdNumber) {
        E maximumValue = firstNumber;
        if (secondNumber.compareTo(maximumValue)>0) {
            maximumValue = secondNumber;
        }
        if(thirdNumber.compareTo(maximumValue)>0) {
            maximumValue=thirdNumber;
        }
        return maximumValue;
    }
}

