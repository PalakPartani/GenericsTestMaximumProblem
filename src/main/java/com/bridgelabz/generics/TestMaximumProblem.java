package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Collections;

public class TestMaximumProblem<E extends Comparable<E>> {
    private E firstValue;
    private E secondValue;
    private E thirdValue;
    private E[] extraArguments;

    public TestMaximumProblem(E firstValue, E secondValue, E thirdValue, E... extraArguements) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.extraArguments = extraArguements;
    }

    public E findMaximum() {
        E max = findMaximum(firstValue, secondValue, thirdValue, extraArguments);
        return max;
    }

    public static <E extends Comparable<E>> E findMaximum(E firstNumber, E secondNumber, E thirdNumber, E... extraArguments) {

        E maximumValue = firstNumber;
        if (secondNumber.compareTo(maximumValue) > 0) {
            maximumValue = secondNumber;
        }
        if (thirdNumber.compareTo(maximumValue) > 0) {
            maximumValue = thirdNumber;
        }
        if (extraArguments.length != 0) {
            Arrays.sort(extraArguments, Collections.reverseOrder());
            if (extraArguments[0].compareTo(maximumValue) > 0) {
                maximumValue = extraArguments[0];
            }
        }
        printMaximumValue(maximumValue);
        return maximumValue;
    }

    public static <E extends Comparable<E>> void printMaximumValue(E maximumValue) {
        System.out.println("Maximum value :" + maximumValue);
    }
}

