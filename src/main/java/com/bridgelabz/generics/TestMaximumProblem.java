package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Collections;

public class TestMaximumProblem <E extends Comparable<E>>{
    private E firstValue;
    private E secondValue;
    private E thirdValue;

    public TestMaximumProblem(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }
    public E findMaximum(){
        E max=findMaximum(firstValue,secondValue,thirdValue);
        return max;
    }

    public static <E extends Comparable<E>> E findMaximum(E firstNumber, E secondNumber, E thirdNumber) {

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

